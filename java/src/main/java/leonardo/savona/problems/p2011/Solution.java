package leonardo.savona.problems.p2011;

class Solution {
    public static final String TITLE = "2011. Final Value of Variable After Performing Operations";

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            switch(s){
                case "++X":
                case "X++":
                    x++;
                    break;
                case "--X":
                case "X--":
                    x--;
                    break;
                default:
                    break;
            }
        }
        return x;
    }
}