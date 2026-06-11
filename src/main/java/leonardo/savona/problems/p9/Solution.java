package leonardo.savona.problems.p9;

import java.util.*;

class Solution {
    public static final String TITLE = "9. Palindrome Number";

    public boolean isPalindrome(int n) {
        if (n < 0) return false;
        if (n < 10) return true;

        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            list.add(r);
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) return false;
        }

        return true;
    }
}