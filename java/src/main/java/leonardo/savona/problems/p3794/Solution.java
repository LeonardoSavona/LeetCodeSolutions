package leonardo.savona.problems.p3794;

class Solution {
    public static final String TITLE = "3794. Reverse String Prefix";

    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i=k-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        sb.append(s.substring(k));
        return sb.toString();
    }
}