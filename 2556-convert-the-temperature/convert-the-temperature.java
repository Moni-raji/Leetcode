class Solution {
    public double[] convertTemperature(double celsius) {
        double f = (celsius * (9.0 / 5.0)) + 32;
        double k = celsius + 273.15;
        return new double[] {k, f};
    }
}
