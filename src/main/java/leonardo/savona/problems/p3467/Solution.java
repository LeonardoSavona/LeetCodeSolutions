package leonardo.savona.problems.p3467;

class Solution {
    public static final String TITLE = "3467. Transform Array by Parity";

    // copied solution
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        int idx=nums.length-1;
        for(int num :nums){
            if(num%2 !=0) result[idx--]=1;
        }
        return result;
    }
}