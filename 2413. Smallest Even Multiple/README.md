# LeetCode Practice  (Day 23)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/TwXNp6hm/Leetcode-copy.jpg)](https://postimg.cc/QB0JyvQx)

## About the problem
- *Problem Number* : 2413
- *Problem Name* :  [Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple/description/ "https://leetcode.com/problems/smallest-even-multiple/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem

Given a **positive** integer `n`, return _the smallest positive integer that is a multiple of  **both**_ `2` _and_ `n`.

**Example 1:**

```
Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
```

**Example 2:**

```
Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
```

**Constraints:**

-   `1 <= n <= 150`

## Approach Explanation

given number 'n' is already even. If it is, I return 'n' itself, as it's the smallest positive integer that is a multiple of both 2 and 'n'. If 'n' is odd, I return 'n * 2' to ensure that the result is an even multiple of 'n'. My approach is concise and effective, directly addressing the requirement for the smallest positive even multiple, and it efficiently handles both even and odd inputs.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
