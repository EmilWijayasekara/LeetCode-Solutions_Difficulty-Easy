# LeetCode Practice  (Day 13)


## About the problem
- *Problem Number* : 1897
- *Problem Name* : [Redistribute Characters to Make All Strings Equal](https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/description/ "https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/description/")
- *Problem difficulty* : Easy (59.04%%)🟢
- *Programming language used* - Java

## Problem



You are given an array of strings  `words`  (**0-indexed**).

In one operation, pick two  **distinct**  indices  `i`  and  `j`, where  `words[i]`  is a non-empty string, and move  **any**  character from  `words[i]`  to  **any**  position in  `words[j]`.

Return  `true`  _if you can make **every**  string in_ `words` _**equal** using  **any**  number of operations_, _and_ `false`  _otherwise_.

**Example 1:**

```
Input: words = ["abc","aabc","bc"]
Output: true
Explanation: Move the first 'a' in words[1] to the front of words[2],
to make words[1] = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return true.
```

**Example 2:**

```
Input: words = ["ab","a"]
Output: false
Explanation: It is impossible to make all the strings equal using the operation.
```

**Constraints:**

-   `1 <= words.length <= 100`
-   `1 <= words[i].length <= 100`
-   `words[i]`  consists of lowercase English letters.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
