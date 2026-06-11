package leonardo.savona.problems.p2325;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void decodeMessage_exampleOne() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        assertEquals("this is a secret", solution.decodeMessage(key, message));
    }

    @Test
    void decodeMessage_exampleTwo() {
        String key = "bca";
        String message = "a b c";
        assertEquals("c a b", solution.decodeMessage(key, message));
    }

    @Test
    void decodeMessage_singleCharacterKey() {
        String key = "a";
        String message = "a";
        assertEquals("a", solution.decodeMessage(key, message));
    }

    @Test
    void decodeMessage_spacesPreservedInMessage() {
        String key = "abcdefghijklmnopqrstuvwxyz";
        String message = "a b";
        assertEquals("a b", solution.decodeMessage(key, message));
    }

    @Test
    void decodeMessage_duplicatesInKeyIgnored() {
        String key = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        String message = "abcdefghijklmnopqrstuvwxyz";
        assertEquals("abcdefghijklmnopqrstuvwxyz", solution.decodeMessage(key, message));
    }

    @Test
    void decodeMessage_keyWithLeadingDuplicates() {
        String key = "bba";
        String message = "b a";
        assertEquals("a b", solution.decodeMessage(key, message));
    }
}
