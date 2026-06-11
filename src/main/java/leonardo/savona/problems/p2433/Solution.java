package leonardo.savona.problems.p2433;

class Solution {
    public static final String TITLE = "2433. Find The Original Array of Prefix Xor";

    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i-1];
        }
        return arr;
    }
}