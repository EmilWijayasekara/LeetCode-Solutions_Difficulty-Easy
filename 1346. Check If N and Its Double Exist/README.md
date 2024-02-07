# LeetCode Practice  (Day 27)

## About the problem
- *Problem Number* : 1346
- *Problem Name* : [Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/description/ "https://leetcode.com/problems/check-if-n-and-its-double-exist/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem

Given an array  `arr`  of integers, check if there exist two indices  `i`  and  `j`  such that :

-   `i != j`
-   `0 <= i, j < arr.length`
-   `arr[i] == 2 * arr[j]`

**Example 1:**

```
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
```

**Example 2:**

```
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
```

**Constraints:**

-   `2 <= arr.length <= 500`
-   `-103 <= arr[i] <= 103`


## Approach Explanation

Iterated over each pair of elements in the array using nested loops. For every pair, I check whether one element is double the other. If I find such a pair where the condition is met and the indices are different, I return true, indicating the existence of such a pair in the array. On the other hand, I return false if no such pair is found. While my approach is straightforward and easy to implement, it may not be the most efficient for larger arrays due to its quadratic time complexity.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
