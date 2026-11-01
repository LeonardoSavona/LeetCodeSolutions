package leonardo.savona.problems.p1021;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void removeOuterParentheses_singlePrimitive() {
        assertEquals("", Solution.removeOuterParentheses("()"));
    }

    @Test
    void removeOuterParentheses_multiplePrimitives() {
        assertEquals("()()()()(())", Solution.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    void removeOuterParentheses_nestedPrimitive() {
        assertEquals("()()", Solution.removeOuterParentheses("(()())"));
    }

    @Test
    void removeOuterParentheses_twoSimplePrimitives() {
        assertEquals("", Solution.removeOuterParentheses("()()"));
    }

    @Test
    void removeOuterParentheses_deeplyNested() {
        assertEquals("(())", Solution.removeOuterParentheses("((()))"));
    }

    @Test
    void removeOuterParentheses_mixedPrimitives() {
        assertEquals("()()()()()", Solution.removeOuterParentheses("(())(())(())(())(())"));
    }
}
