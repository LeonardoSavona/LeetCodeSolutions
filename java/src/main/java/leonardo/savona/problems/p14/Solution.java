package leonardo.savona.problems.p14;

class Solution {
    public static final String TITLE = "14. Longest Common Prefix";

    public String longestCommonPrefix(String[] nums) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i < nums[0].length(); i++) {
            for (int c=1; c < nums.length; c++) {
                if (nums[c].length() < i+1 ||
                        nums[0].charAt(i) != nums[c].charAt(i)) {

                    return result.toString();
                }
            }
            result.append(nums[0].charAt(i));
        }
        return result.toString();
    }
}