# LeetCode Practice  (Day 16)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/wBfHFyVy/Leetcode-copy.jpg)](https://postimg.cc/947vQfsC)

## About the problem
- *Problem Number* : 1812
- *Problem Name* : [Determine Color of a Chessboard Square](https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/ "https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/")
- *Problem difficulty* : Easy (78.03%)🟢
- *Programming language used* - Java

## Problem

You are given  `coordinates`, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

![](https://assets.leetcode.com/uploads/2021/02/19/screenshot-2021-02-20-at-22159-pm.png)

Return  `true` _if the square is white, and_ `false` _if the square is black_.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

**Example 1:**

```
Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
```

**Example 2:**

```
Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
```

**Example 3:**

```
Input: coordinates = "c7"
Output: false
```

**Constraints:**

-   `coordinates.length == 2`
-   `'a' <= coordinates[0] <= 'h'`
-   `'1' <= coordinates[1] <= '8'`

## Approach Explanation

In my solution, I approached the problem by extracting the letter and number components of the chessboard coordinates. Utilizing the ASCII values, I converted the letter to its corresponding integer value. Then, by checking the sum of the converted letter and the numeric part of the coordinate, I determined whether the square was black or white. My logic relies on the fact that if the sum is even, the square is black, and if it's odd, the square is white. This concise approach effectively captures the essence of the problem, providing a clear and efficient solution to determine the color of a given chessboard square.

[![Screenshot-2024-01-03-181626.png](https://i.postimg.cc/pLbwBYM1/Screenshot-2024-01-03-181626.png)](https://postimg.cc/jLc3xf5z)

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
