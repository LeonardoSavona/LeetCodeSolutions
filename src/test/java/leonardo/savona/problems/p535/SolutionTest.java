package leonardo.savona.problems.p535;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void encodeDecodeRoundTrip_typicalUrl() {
        Solution.Codec codec = solution.new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        assertEquals(url, codec.decode(codec.encode(url)));
    }

    @Test
    void encodeDecodeRoundTrip_longUrl() {
        Solution.Codec codec = solution.new Codec();
        String url = "https://www.example.com/path/to/resource?param1=value1&param2=value2&param3=value3";
        assertEquals(url, codec.decode(codec.encode(url)));
    }

    @Test
    void encodeDecodeRoundTrip_urlWithSpecialCharacters() {
        Solution.Codec codec = solution.new Codec();
        String url = "https://example.com/search?q=hello+world&lang=en#results";
        assertEquals(url, codec.decode(codec.encode(url)));
    }

    @Test
    void encodeDecodeRoundTrip_shortUrl() {
        Solution.Codec codec = solution.new Codec();
        String url = "https://a.io";
        assertEquals(url, codec.decode(codec.encode(url)));
    }

    @Test
    void encode_producesDifferentOutput() {
        Solution.Codec codec = solution.new Codec();
        String url = "https://leetcode.com";
        String encoded = codec.encode(url);
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
        assertNotEquals(url, encoded);
    }

    @Test
    void encodeDecodeRoundTrip_emptyString() {
        Solution.Codec codec = solution.new Codec();
        String url = "";
        assertEquals(url, codec.decode(codec.encode(url)));
    }
}
