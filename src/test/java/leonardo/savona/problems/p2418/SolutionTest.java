package leonardo.savona.problems.p2418;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void sortPeople_example() {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        assertArrayEquals(new String[]{"Mary", "Emma", "John"}, solution.sortPeople(names, heights));
    }

    @Test
    void sortPeople_secondExample() {
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};
        assertArrayEquals(new String[]{"Bob", "Alice", "Bob"}, solution.sortPeople(names, heights));
    }

    @Test
    void sortPeople_singlePerson() {
        assertArrayEquals(new String[]{"Solo"}, solution.sortPeople(new String[]{"Solo"}, new int[]{100}));
    }

    @Test
    void sortPeople_alreadySorted() {
        String[] names = {"A", "B", "C"};
        int[] heights = {30, 20, 10};
        assertArrayEquals(new String[]{"A", "B", "C"}, solution.sortPeople(names, heights));
    }

    @Test
    void sortPeople_reversed() {
        String[] names = {"A", "B", "C"};
        int[] heights = {10, 20, 30};
        assertArrayEquals(new String[]{"C", "B", "A"}, solution.sortPeople(names, heights));
    }

    @Test
    void sortPeople_heightsStayPairedWithNames() {
        String[] names = {"low", "high", "mid"};
        int[] heights = {1, 100, 50};
        assertArrayEquals(new String[]{"high", "mid", "low"}, solution.sortPeople(names, heights));
    }
}
