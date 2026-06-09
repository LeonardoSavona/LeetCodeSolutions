package leonardo.savona.base;

import org.junit.jupiter.api.extension.*;

import java.util.ArrayList;
import java.util.List;

public class TimingExtension
        implements BeforeEachCallback, AfterEachCallback, AfterAllCallback {

    private static final ExtensionContext.Namespace NS =
            ExtensionContext.Namespace.create(TimingExtension.class);

    private static final String START = "startTime";
    private static final String TIMES = "times";

    @Override
    public void beforeEach(ExtensionContext ctx) {
        ctx.getStore(NS).put(START, System.nanoTime());
    }

    @Override
    @SuppressWarnings("unchecked")
    public void afterEach(ExtensionContext ctx) {
        long duration = System.nanoTime() - ctx.getStore(NS).remove(START, Long.class);
        System.out.printf("  %-60s  %.3f ms%n", ctx.getDisplayName(), duration / 1e6);

        ExtensionContext classCtx = ctx.getParent().orElse(ctx);
        List<Long> times = (List<Long>) classCtx.getStore(NS)
                .getOrComputeIfAbsent(TIMES, k -> new ArrayList<Long>());
        times.add(duration);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void afterAll(ExtensionContext ctx) {
        List<Long> times = (List<Long>) ctx.getStore(NS).get(TIMES);
        if (times == null || times.isEmpty()) return;
        double avg = times.stream().mapToLong(Long::longValue).average().orElse(0);
        System.out.printf("  AVG [%s]: %.3f ms (%d tests)%n%n",
                ctx.getDisplayName(), avg / 1e6, times.size());
    }
}
