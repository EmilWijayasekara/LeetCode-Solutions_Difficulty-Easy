# LeetCode Practice  (Day 11)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/cLgp9v0n/Leetcode-copy.jpg)](https://postimg.cc/Js8Yt4yr)

## About the problem
- *Problem Number* : 1051
- *Problem Name* :  [Height Checker](https://leetcode.com/problems/height-checker/description/ "https://leetcode.com/problems/height-checker/description/")
- *Problem difficulty* : Easy (76.21%)🟢
- *Programming language used* - Java

## Problem

A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in  **non-decreasing order**  by height. Let this ordering be represented by the integer array  `expected`  where  `expected[i]`  is the expected height of the  `ith`  student in line.

You are given an integer array  `heights`  representing the  **current order**  that the students are standing in. Each  `heights[i]`  is the height of the  `ith`  student in line (**0-indexed**).

Return  _the  **number of indices**  where_ `heights[i] != expected[i]`.

**Example 1:**

```
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
```

**Example 2:**

```
Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
```

**Example 3:**

```
Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.
```

**Constraints:**

-   `1 <= heights.length <= 100`
-   `1 <= heights[i] <= 100`

## Approach Explanation

I began by creating a duplicate array, `sortedArray`, using `Arrays.copyOf` to replicate the original student heights. The purpose of this duplicated array was to represent the expected order of heights, and I achieved this by sorting it using `Arrays.sort`.

The comparison process was then simplified by iterating through both the original `heights` array and the sorted array simultaneously. At each index, I checked whether the height in the original array matched the corresponding height in the sorted array. If a mismatch was detected, I incremented the `count` variable to keep track of the number of indices where the heights did not align with the expected order.


### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
