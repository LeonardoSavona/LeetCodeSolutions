package leonardo.savona.problems.p412;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void fizzBuzz_single() {
        assertEquals(List.of("1"), solution.fizzBuzz(1));
    }

    @Test
    void fizzBuzz_example1() {
        assertEquals(List.of("1", "2", "Fizz"), solution.fizzBuzz(3));
    }

    @Test
    void fizzBuzz_example2() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), solution.fizzBuzz(5));
    }

    @Test
    void fizzBuzz_example3() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"), solution.fizzBuzz(15));
    }

    @Test
    void fizzBuzz_sizeMatchesN() {
        assertEquals(100, solution.fizzBuzz(100).size());
    }

    @Test
    void fizzBuzz_multiplesOfFifteen() {
        List<String> res = solution.fizzBuzz(90);
        assertEquals("FizzBuzz", res.get(29));
        assertEquals("FizzBuzz", res.get(59));
        assertEquals("FizzBuzz", res.get(89));
    }
}
