# LeetCode Practice  (Day 20)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/s2w0PV0q/Leetcode-copy.jpg)](https://postimg.cc/ns9kptxG)

## About the problem
- *Problem Number* : 1784
- *Problem Name* : [Check if Binary String Has at Most One Segment of Ones](https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/ "https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem


Given a binary string  `s`  **​​​​​without leading zeros**, return  `true`​​​  _if_ `s` _contains  **at most one contiguous segment of ones**_. Otherwise, return  `false`.

**Example 1:**

```
Input: s = "1001"
Output: false
Explanation: The ones do not form a contiguous segment.
```

**Example 2:**

```
Input: s = "110"
Output: true
```

**Constraints:**

-   `1 <= s.length <= 100`
-   `s[i]`​​​​ is either  `'0'`  or  `'1'`.
-   `s[0]`  is `'1'`.

## Approach Explanation

Checking whether the binary string contains the substring "01". If this substring is present, it indicates the existence of at least two contiguous segments of ones, and the function returns `false`. Conversely, if the substring is not found, it implies that the ones in the string form a single, unbroken sequence, and the function returns `true`. My approach prioritizes simplicity and readability by utilizing the `contains` method to directly assess the presence of the specified substring, offering a concise solution to the problem.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
