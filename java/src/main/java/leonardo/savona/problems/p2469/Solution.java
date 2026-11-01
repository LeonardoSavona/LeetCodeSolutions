package leonardo.savona.problems.p2469;

class Solution {
    public static final String TITLE = "2469. Convert the Temperature";

    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}