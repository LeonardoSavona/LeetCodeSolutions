package leonardo.savona.problems.p8;

class Solution {
    public static final String TITLE = "8. String to Integer (atoi)";

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;

        int startIndex = 0;
        boolean pos = true;
        char c = s.charAt(startIndex);
        if (c == '-' || c == '+') {
            pos = c != '-';
            startIndex++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=startIndex, len=s.length(); i<len; i++) {
            c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                sb.append(c);
            } else {
                break;
            }
        }

        String res = sb.toString();
        if (res.isEmpty()) {
            return 0;
        } else {
            try {
                long l = Long.parseLong(sb.toString()) * (pos ? 1 : -1);
                if (l > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else if (l < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                else
                    return (int) l;
            } catch (NumberFormatException nfe) {
                return pos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
    }
}