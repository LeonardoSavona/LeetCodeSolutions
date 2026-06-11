package leonardo.savona.problems.p12;

class Solution {
    public static final String TITLE = "12. Integer to Roman";

    private static final String[] M = {"", "M", "MM", "MMM"};
    private static final String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        if (num >= 1000) {
            sb.append(M[num / 1000]);
            num %= 1000;
        }
        if (num >= 100) {
            sb.append(C[num / 100]);
            num %= 100;
        }
        if (num >= 10) {
            sb.append(X[num / 10]);
            num %= 10;
        }
        if (num > 0) {
            sb.append(I[num]);
        }
        
        return sb.toString();
    }
}