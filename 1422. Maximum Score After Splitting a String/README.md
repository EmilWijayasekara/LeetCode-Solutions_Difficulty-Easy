

# LeetCode Practice  (Day 7)

## About the problem
- *Problem Number* : 1422
- *Problem Name* :  [Maximum Score After Splitting a String](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)
- *Problem difficulty* : Easy (58.01%)🟢
- *Programming language used* - Java

## Problem

Given a string  `s` of zeros and ones,  _return the maximum score after splitting the string into two  **non-empty**  substrings_  (i.e.  **left**  substring and  **right**  substring).

The score after splitting a string is the number of  **zeros**  in the  **left**  substring plus the number of  **ones**  in the  **right**  substring.

**Example 1:**

```
Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3
```

**Example 2:**

```
Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
```

**Example 3:**

```
Input: s = "1111"
Output: 3
```

**Constraints:**

-   `2 <= s.length <= 500`
-   The string  `s`  consists of characters  `'0'`  and  `'1'`  only.

## Approach Explanation

#### This solution needs to be optimized.!!! (brute-force approach)
I tried exploring all possible split points in the input string to calculate the score for each split. By maintaining a running maximum, I ensure that the final result is the highest score among all potential splits, and I implemented another two different methods `sumLeftString` and `sumRightString`. These methods are for counting zeros in the left substring and ones in the right substring, respectively.

However, it's worth noting that the solution has a time complexity of O(n^2) due to the nested loop structure, This might become inefficient for larger input sizes. Further optimization could be explored, such as using cumulative sums or dynamic programming techniques to reduce the time complexity.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
