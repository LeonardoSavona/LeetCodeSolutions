package leonardo.savona.problems.p66;

import java.util.*;

class Solution {
    public static final String TITLE = "66. Plus One";

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = digits.length; i > 0; i--) {
            int lastDigit = digits[i - 1];

            if (lastDigit == 10) {
                digits[i-1] = 0;
                if (i == 1) {
                    int[] newDigits = Arrays.copyOf(digits, digits.length+1);
                    newDigits[i] = 0;
                    newDigits[i-1] = 1;
                    return newDigits;
                } else {
                    digits[i-2] = digits[i-2]+1;
                }
                continue;
            }
            break;
        }
        return digits;
    }
}