
# LeetCode Practice  (Day 36)

## About the problem
- *Problem Number* : 1512
- *Problem Name* : [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem

Given an array of integers  `nums`, return  _the number of  **good pairs**_.

A pair  `(i, j)`  is called  _good_  if  `nums[i] == nums[j]`  and  `i`  <  `j`.

**Example 1:**

**Input:** nums = [1,2,3,1,1,3]
**Output:** 4
**Explanation:** There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

**Example 2:**

**Input:** nums = [1,1,1,1]
**Output:** 6
**Explanation:** Each pair in the array are _good_.

**Example 3:**

**Input:** nums = [1,2,3]
**Output:** 0

**Constraints:**

-   `1 <= nums.length <= 100`
-   `1 <= nums[i] <= 100`

## Approach

In my approach, I iterate through each pair of indices in the array using nested loops. For each pair, I check if the elements at those indices are equal and if the first index is less than the second index. If both conditions are met, I increment a counter to count the number of good pairs. Finally, I return the count as the result.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
