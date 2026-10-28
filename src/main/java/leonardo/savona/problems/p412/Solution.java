package leonardo.savona.problems.p412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "412. Fizz Buzz";

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            boolean mod3 = i % 3 == 0, mod5 = i % 5 == 0;
            if (mod3 && mod5) {
                res.add("FizzBuzz");
            } else if (mod3) {
                res.add("Fizz");
            } else if (mod5) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;
    }
}