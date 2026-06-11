package leonardo.savona.problems.p26;

class Solution {
    public static final String TITLE = "26. Remove Duplicates from Sorted Array";

    public int removeDuplicates(int[] nums) {
          int c = 1;
        int last = nums[0];

       for(int i=1; i< nums.length; i++) {
           if (nums[i] != last) {

               nums[c] = nums[i];
               c++;
               last = nums[i];
           }

           if (i+1 > c) nums[i] = 0;
       }

       return c;
    }
}