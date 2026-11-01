package leonardo.savona.problems.p2037;

class Solution {
    public static final String TITLE = "2037. Minimum Number of Moves to Seat Everyone";

    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;

        int seatsLen = seats.length;
        int studentsLen = students.length;

        while (seatsLen > 0 && studentsLen > 0) {
            res += Math.abs(min(students, studentsLen) - min(seats, seatsLen));
            studentsLen--;
            seatsLen--;
        }

        return res;
    }

    private int min(int[] array, int len) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i=0; i<len; i++) {
            if (array[i] < min) {
                minIdx = i;
                min = array[i];
            }
        }

        int tmp = array[minIdx];
        array[minIdx] = array[len-1];
        array[len-1] = tmp;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4}));

        System.out.println(new Solution().minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6}));
    }
}