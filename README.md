# LeetCode Practice (Day 1)

This repository contains my solutions to various LeetCode problems. I use this space to practice coding, improve my algorithmic skills, and showcase my solutions.

## About the problem

- **Problem Number** : 1
- **Problem Name** : Two Sum
- **Problem difficulty** : Easy (51.25%)
- **Category** : Algorithms
- **Programming language used** - Java

In this problem we have integer array and target, solution must return indices of the two numbers in array such they add up to _target_
given examples are

> Example 1:
> Input: nums = [2,7,11,15], target = 9
> Output: [0,1]
> ~ Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

> Example 2:
> Input: nums = [3,2,4], target = 6
> Output: [1,2]

> Example 3:
> Input: nums = [3,3], target = 6
> Output: [0,1]

## Approach Explanation

In the "Two sum" problem I iterated through the array elements checking if the target value and sum of the elements in the array were equal. This problem can be solved using two arrays. In this problem, we can't add the same number twice to get the target value so the second for loop must avoid used values.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇