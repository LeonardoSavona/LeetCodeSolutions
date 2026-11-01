package leonardo.savona.problems.p2798;

class Solution {
    public static final String TITLE = "2798. Number of Employees Who Met the Target";

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for (int i=0, length=hours.length; i<length; i++){
            if (hours[i] >= target) result++;
        }
        return result;
    }
}