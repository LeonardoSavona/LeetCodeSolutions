package leonardo.savona.problems.p3838;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void mapWordWeights_singleWordSingleChar() {
        int[] weights = new int[26];
        weights[0] = 1;
        String result = Solution.mapWordWeights(new String[]{"a"}, weights);
        assertEquals(1, result.length());
        assertEquals('y', result.charAt(0));
    }

    @Test
    void mapWordWeights_weightModulo26() {
        int[] weights = new int[26];
        for (int i = 0; i < 26; i++) weights[i] = 1;
        String result = Solution.mapWordWeights(new String[]{"abcdefghijklmnopqrstuvwxyz"}, weights);
        assertEquals(1, result.length());
        assertEquals('z', result.charAt(0));
    }

    @Test
    void mapWordWeights_multipleWords() {
        int[] weights = new int[26];
        weights[0] = 2;
        weights[1] = 3;
        String result = Solution.mapWordWeights(new String[]{"a", "b", "ab"}, weights);
        assertEquals(3, result.length());
        assertEquals(Solution.za.charAt(2 % 26), result.charAt(0));
        assertEquals(Solution.za.charAt(3 % 26), result.charAt(1));
        assertEquals(Solution.za.charAt(5 % 26), result.charAt(2));
    }

    @Test
    void mapWordWeights_allZeroWeights() {
        int[] weights = new int[26];
        String result = Solution.mapWordWeights(new String[]{"abc", "xyz"}, weights);
        assertEquals(2, result.length());
        assertEquals('z', result.charAt(0));
        assertEquals('z', result.charAt(1));
    }

    @Test
    void mapWordWeights_largeTotalWeightWrapsAround() {
        int[] weights = new int[26];
        for (int i = 0; i < 26; i++) weights[i] = 10;
        String result = Solution.mapWordWeights(new String[]{"aaa"}, weights);
        assertEquals(1, result.length());
        assertEquals(Solution.za.charAt(30 % 26), result.charAt(0));
    }

    @Test
    void mapWordWeights_singleWordAllSameChar() {
        int[] weights = new int[26];
        weights['z' - 'a'] = 5;
        String result = Solution.mapWordWeights(new String[]{"zzz"}, weights);
        assertEquals(1, result.length());
        assertEquals(Solution.za.charAt(15 % 26), result.charAt(0));
    }
}
