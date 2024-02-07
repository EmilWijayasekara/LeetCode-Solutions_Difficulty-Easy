# LeetCode Practice  (Day 22)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/PJhVpCTq/Leetcode-copy.jpg)](https://postimg.cc/VrGW2LSy)

## About the problem
You're given strings  `jewels`  representing the types of stones that are jewels, and  `stones`  representing the stones you have. Each character in  `stones`  is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so  `"a"`  is considered a different type of stone from  `"A"`.

**Example 1:**

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
```

**Example 2:**

```
Input: jewels = "z", stones = "ZZ"
Output: 0
```

**Constraints:**

-   `1 <= jewels.length, stones.length <= 50`
-   `jewels`  and  `stones`  consist of only English letters.
-   All the characters of `jewels`  are  **unique**.

## Approach Explanation

In the problem by using nested loops to iterate through each character in both the `jewels` and `stones` strings. For each character in `jewels`, I checked if it matched any character in `stones`, and if so, incremented a counter. This counter represents the count of stones that are also jewels. My approach is straightforward and involves a systematic comparison of each character in the two strings, providing a clear and direct solution to the problem. While effective, it's worth noting that there are more optimized approaches using data structures like sets to enhance efficiency, especially for larger inputs.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
