package leonardo.savona.problems.p49;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void groupAnagrams_typicalMixedAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        assertNotNull(result);
        assertEquals(3, result.size());
        List<String> flat = new ArrayList<>();
        for (List<String> group : result) flat.addAll(group);
        assertEquals(6, flat.size());
        assertTrue(flat.containsAll(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
    }

    @Test
    void groupAnagrams_singleElement() {
        String[] input = {"abc"};
        List<List<String>> result = solution.groupAnagrams(input);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(List.of("abc"), result.get(0));
    }

    @Test
    void groupAnagrams_allSameAnagram() {
        String[] input = {"abc", "bca", "cab"};
        List<List<String>> result = solution.groupAnagrams(input);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
    }

    @Test
    void groupAnagrams_emptyStringOnly() {
        String[] input = {""};
        List<List<String>> result = solution.groupAnagrams(input);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(List.of(""), result.get(0));
    }

    @Test
    void groupAnagrams_noAnagramsAmongElements() {
        String[] input = {"abc", "def", "ghi"};
        List<List<String>> result = solution.groupAnagrams(input);
        assertNotNull(result);
        assertEquals(3, result.size());
        for (List<String> group : result) {
            assertEquals(1, group.size());
        }
    }

    @Test
    void groupAnagrams_multipleEmptyStrings() {
        String[] input = {"", "", "a", "a"};
        List<List<String>> result = solution.groupAnagrams(input);
        assertNotNull(result);
        assertEquals(2, result.size());
        boolean foundEmptyGroup = false;
        boolean foundAGroup = false;
        for (List<String> group : result) {
            if (group.contains("")) {
                assertEquals(2, group.size());
                foundEmptyGroup = true;
            } else if (group.contains("a")) {
                assertEquals(2, group.size());
                foundAGroup = true;
            }
        }
        assertTrue(foundEmptyGroup);
        assertTrue(foundAGroup);
    }
}
