class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int testCount = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if(batteryPercentages[i]>0){
                testCount++;
                for (int j = i+1; j < batteryPercentages.length; j++) {
                    if(batteryPercentages[j]>0){
                        batteryPercentages[j]=batteryPercentages[j]-1;
                    }
                }
            }
        }
        return testCount;
    }
}
//yu
