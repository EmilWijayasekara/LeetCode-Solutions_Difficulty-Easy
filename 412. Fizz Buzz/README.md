# LeetCode Practice  (Day 17)

## Achievements

[![Leetcode-Recovered.jpg](https://i.postimg.cc/brQTK3MN/Leetcode-Recovered.jpg)](https://postimg.cc/QKd17khR)

## About the problem
- *Problem Number* : 412
- *Problem Name* : [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/description/ "https://leetcode.com/problems/fizz-buzz/description/")
- *Problem difficulty* : Easy (71.30%)🟢
- *Programming language used* - Java

## Problem

Given an integer  `n`, return  _a string array_ `answer` _(**1-indexed**) where_:

-   `answer[i] == "FizzBuzz"`  if  `i`  is divisible by  `3`  and  `5`.
-   `answer[i] == "Fizz"`  if  `i`  is divisible by  `3`.
-   `answer[i] == "Buzz"`  if  `i`  is divisible by  `5`.
-   `answer[i] == i`  (as a string) if none of the above conditions are true.

**Example 1:**

```
Input: n = 3
Output: ["1","2","Fizz"]
```

**Example 2:**

```
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
```

**Example 3:**

```
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
```

**Constraints:**

-  `1 <= n <= 104`

## Approach Explanation

In my solution to the FizzBuzz problem, I iterated through the numbers from 1 to `'n'`, checking the divisibility conditions to determine the appropriate string representation for each number. I first converted the current number to a string (`num`) to handle cases where the number doesn't meet any of the FizzBuzz conditions.

For each number, I checked if it was divisible by both 3 and 5, and if so, I added "FizzBuzz" to the list. If not, I checked individually for divisibility by 3 or 5 and added "Fizz" or "Buzz" accordingly. If the number didn't meet any of these conditions, I added its string representation to the list.

This approach ensures that each number is accurately categorized based on the FizzBuzz rules, and the resulting list reflects the Fizz, Buzz, and FizzBuzz sequence up to the given integer `'n'`. The use of string representations simplifies the process and enhances readability in constructing the FizzBuzz output.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
