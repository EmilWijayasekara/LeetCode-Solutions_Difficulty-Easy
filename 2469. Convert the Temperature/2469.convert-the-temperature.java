class Solution {
    public double[] convertTemperature(double celsius) {
        double[] tempArray = new double[2];
        tempArray[0] = celsius + 273.15;
        tempArray[1] = celsius * 1.80 + 32.00;
        return tempArray;
    }
}
