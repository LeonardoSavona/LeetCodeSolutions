package leonardo.savona.problems.p3894;

class Solution {
    public static final String TITLE = "3894. Traffic Signal Color";

    public String trafficSignal(int timer) {
        if (timer > 90) return "Invalid";
        if (timer > 30) return "Red";
        if (timer == 30) return "Orange";
        if (timer == 0) return "Green";
        return "Invalid";
    }
}