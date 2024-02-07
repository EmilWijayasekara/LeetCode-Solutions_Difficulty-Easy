# LeetCode Practice  (Day 26)

## Achievements 

[![Leetcode-copy.jpg](https://i.postimg.cc/d3nGDwSr/Leetcode-copy.jpg)](https://postimg.cc/N29Kzqtj)

## About the problem
- *Problem Number* : 1678
- *Problem Name* : [Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/description/ "https://leetcode.com/problems/goal-parser-interpretation/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem

You own a  **Goal Parser**  that can interpret a string  `command`. The  `command`  consists of an alphabet of  `"G"`,  `"()"`  and/or  `"(al)"`  in some order. The Goal Parser will interpret  `"G"`  as the string  `"G"`,  `"()"`  as the string  `"o"`, and  `"(al)"`  as the string  `"al"`. The interpreted strings are then concatenated in the original order.

Given the string  `command`, return  _the  **Goal Parser**'s interpretation of_ `command`.

**Example 1:**

```
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
```

**Example 2:**

```
Input: command = "G()()()()(al)"
Output: "Gooooal"
```

**Example 3:**

```
Input: command = "(al)G(al)()()G"
Output: "alGalooG"
```

**Constraints:**

-   `1 <= command.length <= 100`
-   `command`  consists of  `"G"`,  `"()"`, and/or  `"(al)"`  in some order.

## Approach Explanation

`replace` method to substitute occurrences of specific patterns in the `command` string. I replaced "()" with "o" and "(al)" with "al", effectively implementing the interpretation rules of the Goal Parser. This approach simplifies the task of transforming the input string into its interpreted form, providing a concise and readable solution to the problem.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
