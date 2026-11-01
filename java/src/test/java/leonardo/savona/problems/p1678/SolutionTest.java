package leonardo.savona.problems.p1678;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void interpret_onlyG() {
        assertEquals("G", solution.interpret("G"));
    }

    @Test
    void interpret_onlyEmptyParens() {
        assertEquals("o", solution.interpret("()"));
    }

    @Test
    void interpret_onlyAlGroup() {
        assertEquals("al", solution.interpret("(al)"));
    }

    @Test
    void interpret_mixedCommand() {
        assertEquals("Goal", solution.interpret("G()(al)"));
    }

    @Test
    void interpret_multipleGroupsCombined() {
        assertEquals("Gooal", solution.interpret("G()()(al)"));
    }

    @Test
    void interpret_complexCommand() {
        assertEquals("alGalGoal", solution.interpret("(al)G(al)G()(al)"));
    }
}
