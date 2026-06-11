package leonardo.savona.problems.p1769;

class Solution {
    public static final String TITLE = "1769. Minimum Number of Operations to Move All Balls to Each Box";

    public int[] minOperations(String boxes) {
                int[] result = new int[boxes.length()];
        for (int i=0; i<boxes.length(); i++) {
            for (int j=0; j<boxes.length(); j++) {
                if (i != j && boxes.charAt(j) == '1')
                    result[i] += Math.abs(j-i);
            }
        }
        return result;
    }
}