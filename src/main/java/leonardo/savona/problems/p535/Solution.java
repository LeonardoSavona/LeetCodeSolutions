package leonardo.savona.problems.p535;

import java.util.*;

class Solution {
    public static final String TITLE = "535. Encode and Decode TinyURL";

    public class Codec {

        public String encode(String longUrl) {
            return Base64.getEncoder().withoutPadding().encodeToString(longUrl.getBytes());
        }

        public String decode(String shortUrl) {
            return new String(Base64.getDecoder().decode(shortUrl.getBytes()));
        }
    }
}
