# LeetCode Practice  (Day 19)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/q7Yn2Y4p/Leetcode-copy.jpg)](https://postimg.cc/ns4CJ3XW)

## About the problem
- *Problem Number* : 1389
- *Problem Name* : [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/description/ "https://leetcode.com/problems/create-target-array-in-the-given-order/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem

Given two arrays of integers `nums`  and  `index`. Your task is to create  _target_  array under the following rules:

-   Initially  _target_  array is empty.
-   From left to right read nums[i] and index[i], insert at index  `index[i]` the value  `nums[i]` in _target_  array.
-   Repeat the previous step until there are no elements to read in  `nums`  and  `index.`

Return the  _target_  array.

It is guaranteed that the insertion operations will be valid.

**Example 1:**

```
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
```

**Example 2:**

```
Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
```

**Example 3:**

```
Input: nums = [1], index = [0]
Output: [1]
```

**Constraints:**

-   `1 <= nums.length, index.length <= 100`
-   `nums.length == index.length`
-   `0 <= nums[i] <= 100`
-   `0 <= index[i] <= i`


## Approach Explanation

By utilizing an `ArrayList` to dynamically build the target array. For each element in the given `nums` array and its corresponding index in the `index` array, I used the `ArrayList`'s `add` method to insert the value at the specified index. This way, I iterated through the arrays, progressively constructing the target array according to the given rules.

After completing the insertion process, I copied the elements from the ArrayList back to the original `nums` array. This final array represents the target array formed through the sequential insertions based on the specified indices. My approach aims for clarity and simplicity, leveraging the ArrayList's flexibility to efficiently handle insertions at specific positions and resulting in a concise solution to the problem.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌
