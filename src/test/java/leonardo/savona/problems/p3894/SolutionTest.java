package leonardo.savona.problems.p3894;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void trafficSignal_green() {
        assertEquals("Green", solution.trafficSignal(0));
    }

    @Test
    void trafficSignal_orange() {
        assertEquals("Orange", solution.trafficSignal(30));
    }

    @Test
    void trafficSignal_red() {
        assertEquals("Red", solution.trafficSignal(60));
    }

    @Test
    void trafficSignal_redBounds() {
        assertEquals("Red", solution.trafficSignal(31));
        assertEquals("Red", solution.trafficSignal(90));
    }

    @Test
    void trafficSignal_invalidBelowOrange() {
        assertEquals("Invalid", solution.trafficSignal(5));
        assertEquals("Invalid", solution.trafficSignal(1));
        assertEquals("Invalid", solution.trafficSignal(29));
    }

    @Test
    void trafficSignal_invalidAboveRed() {
        assertEquals("Invalid", solution.trafficSignal(91));
        assertEquals("Invalid", solution.trafficSignal(1000));
    }
}
