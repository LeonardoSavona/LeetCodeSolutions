package leonardo.savona.problems.p1313;

import java.util.*;

class Solution {
    public static final String TITLE = "1313. Decompress Run-Length Encoded List";

    public int[] decompressRLElist(int[] nums) {
        int[] res = new int[0];
        for (int i=0, len=nums.length; i<len; i+=2) {
            int resLen = res.length;
            res = Arrays.copyOf(res, resLen + nums[i]);
            Arrays.fill(res, resLen, res.length, nums[i+1]);
        }
        return res;
    }
}