# LeetCode Practice  (Day 25)

## Achievements 

[![Leetcode-copy.jpg](https://i.postimg.cc/kXFXCXv2/Leetcode-copy.jpg)](https://postimg.cc/GHt1JRNR)

## About the problem
- *Problem Number* : 2011
- *Problem Name* :  [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/ "https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem

There is a programming language with only  **four**  operations and  **one**  variable  `X`:

-   `++X`  and  `X++`  **increments**  the value of the variable  `X`  by  `1`.
-   `--X`  and  `X--`  **decrements**  the value of the variable  `X`  by  `1`.

Initially, the value of  `X`  is  `0`.

Given an array of strings  `operations`  containing a list of operations, return  _the  **final** value of_ `X`  _after performing all the operations_.

**Example 1:**

```
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
```

**Example 2:**

```
Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
```

**Example 3:**

```
Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.
```

**Constraints:**

-   `1 <= operations.length <= 100`
-   `operations[i]`  will be either  `"++X"`,  `"X++"`,  `"--X"`, or  `"X--"`.

## Approach Explanation

In my solution, I addressed the problem by iterating through the array of operations and updating the value of the variable 'X' based on the conditions specified by each operation. I used a simple if-else structure to handle each operation type, ensuring that the value of 'X' is appropriately incremented or decremented. The final value of 'X' is then returned. My approach is straightforward, effectively capturing the essence of each operation and updating the variable accordingly. It is a concise and clear solution to the given problem.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
