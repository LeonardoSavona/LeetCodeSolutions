package leonardo.savona.problems.p3280;

class Solution {
    public static final String TITLE = "3280. Convert Date to Binary";

    public String convertDateToBinary(String date) {
        return Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))) + "-" +
                Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))) + "-" +
                Integer.toBinaryString(Integer.parseInt(date.substring(8)));
    }
}