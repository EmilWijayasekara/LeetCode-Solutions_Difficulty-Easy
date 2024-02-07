
# LeetCode Practice (Day 2)

This repository contains my solutions to various LeetCode problems. I use this space to practice coding, improve my algorithmic skills, and showcase my solutions.

## About the problem
- *Problem Number* : 9
- *Problem Name* :  [Palindrome Number](https://leetcode.com/problems/palindrome-number/description/ "https://leetcode.com/problems/palindrome-number/description/")
- *Problem difficulty* : Easy (55.01%) 🟢
- *Category* : [Math](https://leetcode.com/tag/math "https://leetcode.com/tag/math")
- *Programming language used* - [Java](https://www.java.com/en/)

In this problem given an integer x, return true if x is a *palindrome*, and false otherwise.
given examples are, 

>*Example 1:*

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.


>*Example 2:*

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


>*Example 3:*

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


## Approach Explanation
[![Screenshot-2023-12-15-114734.png](https://i.postimg.cc/0Qn7PPCh/Screenshot-2023-12-15-114734.png)](https://postimg.cc/ygJDTqtT)

In my approach, first, I converted the integer into a char array because then the array can be reversed. And using a for loop, I reversed the char array.

[![Screenshot-2023-12-15-114741.png](https://i.postimg.cc/xCnLwcLK/Screenshot-2023-12-15-114741.png)](https://postimg.cc/PLVLZf3x)

Using the for loop, I changed the index of arrays to reverse the order. In this case, if the array length is 3 then,

    i=0 then j=2
    i=1 then j=1
    i=2 then j=0 
[![Screenshot-2023-12-15-114746.png](https://i.postimg.cc/bvQQVQSy/Screenshot-2023-12-15-114746.png)](https://postimg.cc/Z95BCvL2)

Next, I tried to convert this char array to a string and then to integer type, where i got this error :

    Exception in thread "main" java.lang.NumberFormatException: For input string: "9987654321" at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.ja a:67)
    	at java.base/java.lang.Integer.parseInt(Integer.java:668)
    	at java.base/java.lang.Integer.parseInt(Integer.java:786)
    	at Main.isPalindrome(Main.java:33)
    	at Main.main(Main.java:3)
Then I had to convert this into a long type.

[![Screenshot-2023-12-15-114750.png](https://i.postimg.cc/zfmCkdB2/Screenshot-2023-12-15-114750.png)](https://postimg.cc/sMcGj455)

Finally, I compared both long and int values and then returned the true or false value.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
