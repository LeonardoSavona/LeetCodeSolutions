package leonardo.savona.problems.p1773;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void countMatches_byType() {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        assertEquals(2, solution.countMatches(items, "type", "phone"));
    }

    @Test
    void countMatches_byColor() {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "blue", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        assertEquals(2, solution.countMatches(items, "color", "blue"));
    }

    @Test
    void countMatches_byName() {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "pixel"),
                Arrays.asList("phone", "gold", "iphone")
        );
        assertEquals(2, solution.countMatches(items, "name", "pixel"));
    }

    @Test
    void countMatches_noMatches() {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo")
        );
        assertEquals(0, solution.countMatches(items, "type", "tablet"));
    }

    @Test
    void countMatches_allMatch() {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "gold", "iphone"),
                Arrays.asList("phone", "silver", "samsung"),
                Arrays.asList("phone", "blue", "pixel")
        );
        assertEquals(3, solution.countMatches(items, "type", "phone"));
    }

    @Test
    void countMatches_singleItemMatch() {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("computer", "silver", "lenovo")
        );
        assertEquals(1, solution.countMatches(items, "name", "lenovo"));
    }
}
