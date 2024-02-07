# LeetCode Practice  (Day 10)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/L89J9Jt1/Leetcode-copy.jpg)](https://postimg.cc/rKHVgFYV)

## About the problem
- *Problem Number* : 2960
- *Problem Name* :  [Count Tested Devices After Test Operations](https://leetcode.com/problems/count-tested-devices-after-test-operations/)
- *Problem difficulty* : Easy (80.90%)🟢
- *Programming language used* - Java

## Problem

You are given a  **0-indexed**  integer array  `batteryPercentages`  having length  `n`, denoting the battery percentages of  `n`  **0-indexed**  devices.

Your task is to test each device  `i`  **in order**  from  `0`  to  `n - 1`, by performing the following test operations:

-   If  `batteryPercentages[i]`  is  **greater**  than  `0`:
    -   **Increment**  the count of tested devices.
    -   **Decrease**  the battery percentage of all devices with indices  `j`  in the range  `[i + 1, n - 1]`  by  `1`, ensuring their battery percentage  **never goes below**  `0`, i.e,  `batteryPercentages[j] = max(0, batteryPercentages[j] - 1)`.
    -   Move to the next device.
-   Otherwise, move to the next device without performing any test.

Return  _an integer denoting the number of devices that will be tested after performing the test operations in order._

**Example 1:**

    Input: batteryPercentages = [1,1,2,1,3]
    Output: 3
    Explanation: Performing the test operations in order starting from device 0: 
    - At device 0, batteryPercentages[0] > 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2]. 
    - At device 1, batteryPercentages[1] == 0, so we move to the next device without testing. 
    - At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1]. 
    - At device 3, batteryPercentages[3] == 0, so we move to the next device without testing. 
    - At device 4, batteryPercentages[4] > 0, so there are now 3 tested devices, and batteryPercentages stays the same. 
    - So, the answer is 3.

**Example 2:**

    Input: batteryPercentages = [0,1,2]
    Output: 2
    Explanation: Performing the test operations in order starting from device 0:
    - At device 0, batteryPercentages[0] == 0, so we move to the next device without testing.
    - At device 1, batteryPercentages[1] > 0, so there is now 1 tested device, and batteryPercentages becomes [0,1,1].
    - At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages stays the same.
    - So, the answer is 2.

**Constraints:**

-   `1 <= n == batteryPercentages.length <= 100`
-   `0 <= batteryPercentages[i] <= 100`

## Approach Explanation

The approach involves iterating through the array `batteryPercentages`and performing test operations on each device according to the specified conditions. The variable `testCount` is used to keep track of the number of tested devices. The outer loop, controlled by the index variable `i`, iterates through each device in the array. Within this loop, an if statement checks whether the battery percentage of the current device `(indexed by i)` is greater than 0. If true, it indicates that the device is eligible for testing. Consequently, the `testCount` is incremented, marking this device as tested. Following the testing of the current device, a nested loop `(controlled by the index variable j)` iterates through the remaining devices `(from i + 1 to n - 1)`. Within this loop, another if statement checks whether the battery percentage of the current device `(indexed by j)` is greater than 0. If true, it implies that the battery of this device can be reduced by 1 without going below 0. Therefore, the battery percentage of the device at index `j` is decremented by 1.

### previous approach

``` cpp
class Solution {  
    public int countTestedDevices(int[] batteryPercentages) {  
        int testCount = 0;  
        for (int i = 0; i < batteryPercentages.length; i++) {  
            if(batteryPercentages[i]>0){  
                testCount++;  
                batteryPercentages=decreaseBatteryarray(batteryPercentages,i, batteryPercentages.length);  
                System.out.println(Arrays.toString(batteryPercentages));  
            }  
        }  
        return testCount;  
    }  
    public int[] decreaseBatteryarray(int[] array, int i, int n){  
        for (int j = 0; j < n; j++) {  
            if(array[j]>0){  
                array[j]=array[j]-1;  
            }  
        }  
        return array;  
    }  
}
```
[![Leetcode-copysd.jpg](https://i.postimg.cc/T3tppT0H/Leetcode-copysd.jpg)](https://postimg.cc/w1s6r8Sh)

Well this code is no good 😅


### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
