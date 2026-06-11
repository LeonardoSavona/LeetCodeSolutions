package leonardo.savona.problems.p3701;

class Solution {
    public static final String TITLE = "3701. Compute Alternating Sum";

    public int alternatingSum(int[] nums) {
        int dispari = 0;
        int pari = 0;
        
        for (int i=0, len=nums.length; i<len; i++) {
            if (i % 2 == 0) 
                pari += nums[i];
            else 
                dispari -= nums[i];
        }
        return dispari+pari;
    }
}