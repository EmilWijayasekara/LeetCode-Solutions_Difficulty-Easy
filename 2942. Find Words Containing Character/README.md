# LeetCode Practice  (Day 21)

## About the problem
- *Problem Number* : 2942
- *Problem Name* :  [Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/description/ "https://leetcode.com/problems/find-words-containing-character/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem


You are given a  **0-indexed**  array of strings  `words`  and a character  `x`.

Return  _an  **array of indices**  representing the words that contain the character_ `x`.

**Note**  that the returned array may be in  **any**  order.

**Example 1:**

```
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
```

**Example 2:**

```
Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
```

**Example 3:**

```
Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
```

**Constraints:**

-   `1 <= words.length <= 50`
-   `1 <= words[i].length <= 50`
-   `x`  is a lowercase English letter.
-   `words[i]`  consists only of lowercase English letters.

## Approach Explanation

I checked if the character at the current position matched the given character 'x'. If a match was found, I added the index of the word to a list and moved on to the next word. My approach aims for simplicity and effectiveness, focusing on a straightforward iteration through the words and characters to identify those containing the specified character. The resulting list captures the indices of words satisfying the condition, providing a clear and concise solution to the problem.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
