package leonardo.savona.problems.p3940;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertArrayEquals(new int[]{1,1,2,2,3}, solution.limitOccurrences(new int[]{1,1,1,2,2,3}, 2));
    }
}
