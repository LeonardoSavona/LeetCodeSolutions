package leonardo.savona.problems.p67;

class Solution {
    public static final String TITLE = "67. Add Binary";

    public String addBinary(String a, String b) {
         int aLen = a.length();
        int bLen = b.length();
        if (aLen < bLen) {
            String c = a;
            a = b;
            b = c;
            aLen = a.length();
            bLen = b.length();
        }

        b = "0"+b;
        StringBuilder result = new StringBuilder();
        int resto = 0;
        for (int bi=bLen, ai=aLen-1; ai>=0; ai--) {
            int aint = a.charAt(ai)-'0';
            int bint = b.charAt(bi)-'0';

            int xor = aint ^ bint;
            int res = xor ^ resto;
            resto = (aint & bint) | (xor & resto);
            result.insert(0, res);
            if (bi > 0) bi--;
        }

        if (resto == 1) result.insert(0, "1");
        return result.toString();
    }
}