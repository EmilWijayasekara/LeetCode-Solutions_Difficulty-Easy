

# LeetCode Practice  (Day 5)

## About the problem
- *Problem Number* : 20
- *Problem Name* :  [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- *Problem difficulty* : Easy (40.26%)🟢
- *Programming language used* - Java

## Problem

Given a string  `s`  containing just the characters  `'('`,  `')'`,  `'{'`,  `'}'`,  `'['`  and  `']'`, determine if the input string is valid.

An input string is valid if:

1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.
3.  Every close bracket has a corresponding open bracket of the same type.

**Example 1:**

```
Input: s = "()"
Output: true
```

**Example 2:**

```
Input: s = "()[]{}"
Output: true
```

**Example 3:**

```
Input: s = "(]"
Output: false
```

**Constraints:**

-   `1 <= s.length <= 104`
-   `s`  consists of parentheses only  `'()[]{}'`.

## Approach Explanation
### first attempt
```cpp
boolean boolout = false;  
public static boolean isValid(String s) {  
    boolean boolout = false;  
    if(s.length() % 2 == 0){  
        for (int i = 0; i < s.length(); i++) {  
            switch (s.charAt(i)){  
                case '(' :  
                    if(s.charAt(i+1) == ')') {boolout=true;}  
                    else {boolout=false;}  
                    break;  
                case '{' :  
                    if(s.charAt(i+1) == '}') {boolout=true;}  
                    else {boolout=false;}  
                    break;  
                case '[' :  
                    if(s.charAt(i+1) == ']') {boolout=true;}  
                    else {boolout=false;}  
                    break;  
  
                default:  
                    return false;  
            }  
            return boolout;  
        }  
    }  
    return false;  
}
```
The first attempt was this, but the problem does not clearly state that the parenthesis can open after another, so this solution is invalid. This solution is valid for that parenthesis does not open one after another.

After realizing the mistake I chose to go with Stacks.
hence the second attempt:

```cpp
public static boolean isValid(String s) {  
    class Solution {  
        public boolean isValid(String s) {  
            if(s.length() % 2 == 0){  
                Stack<Character> stack = new Stack<>();  
                for (int i = 0; i < s.length(); i++) {  
                    if(s.charAt(i)=='('){  
                        stack.push(')');  
                    }  
                    if(s.charAt(i)=='{'){  
                        stack.push('}');  
                    }  
                    if(s.charAt(i)=='['){  
                        stack.push(']');  
                    }  
                    if(stack.empty()==false){  
                        if(s.charAt(i)==stack.peek()){  
                            System.out.println(s.charAt(i)+" = "+stack.peek());  
                            stack.pop();  
                        }  
                        else return false;  
                    }  
                    else return false;  
                }  
                return stack.empty();  
            }  
            return false;  
        }  
}
```
This is also wrong for some test cases.
### idea behind the correct answer
The idea is to use a stack to keep track of the opening symbols encountered. When an opening symbol is found, its corresponding closing symbol is pushed onto the stack. For every closing symbol, I check if the stack is empty or if the top of the stack matches the current closing symbol. If everything matches up, and the stack is empty at the end, the string is valid. Otherwise, it's not. Simple and efficient!

## Earlier attempts
```cpp
import java.util.Stack;  
  
public class Main {  
    public static void main(String[] args) {  
        String s = "()[]";  
        System.out.println(isValid(s));  
    }  
  
    public static boolean isValid(String s) {  
        class Solution {  
            public boolean isValid(String s) {  
                if(s.length() % 2 == 0){  
                    Stack<Character> stack = new Stack<>();  
                    for (int i = 0; i < s.length(); i++) {  
                        if(s.charAt(i)=='('){  
                            stack.push(')');  
                        }  
                        if(s.charAt(i)=='{'){  
                            stack.push('}');  
                        }  
                        if(s.charAt(i)=='['){  
                            stack.push(']');  
                        }  
                        if(stack.empty()==false){  
                            if(s.charAt(i)==stack.peek()){  
                                System.out.println(s.charAt(i)+" = "+stack.peek());  
                                stack.pop();  
                            }  
                            else return false;  
                        }  
                        else return false;  
                    }  
                    return stack.empty();  
                }  
                return false;  
            }  
    }  
}  
  
/*boolean boolout = false;  
 if(s.length() % 2 == 0){ for (int i = 0; i < s.length(); i++) { switch (s.charAt(i)){ case '(' : if(s.charAt(i+1) == ')') {boolout=true;} else {boolout=false;} break; case '{' : if(s.charAt(i+1) == '}') {boolout=true;} else {boolout=false;} break; case '[' : if(s.charAt(i+1) == ']') {boolout=true;} else {boolout=false;} break;  
 default: return false; } return boolout; } } return false;*/  
/*if(s.length() % 2 == 0){  
 System.out.println("even"); for (int i = 0; i < s.length(); i++) { if(s.charAt(i)=='(') if(s.charAt(i+1)==')'){  
 } } } else { return false; } return false;*/  
/*  
class Solution {  
 public boolean isValid(String s) { if(s.length() % 2 == 0){ Stack<Character> stack = new Stack<>(); for (int i = 0; i < s.length(); i++) { if(s.charAt(i)=='('){ stack.push(')'); } if(s.charAt(i)=='{'){ stack.push('}'); } if(s.charAt(i)=='['){ stack.push(']'); } if(stack.empty()==false){ if(s.charAt(i)==stack.peek()){ System.out.println(s.charAt(i)+" = "+stack.peek()); stack.pop(); } else return false; } else return false; } return stack.empty(); } return false; }}*/  
  
/*if(s.length() % 2 == 0){  
Stack<Character> stack = new Stack<>();  
boolean retBool = false;  
 for (int i = 0; i < s.length(); i++) { switch (s.charAt(i)){ case '(' : System.out.println("found ("); stack.push(')'); break;  
 case '{' : System.out.println("found {"); stack.push('}'); break;  
 case '[' : System.out.println("found ["); stack.push(']'); break;  
 case ')' : if(stack.empty() == false){ if(')' == stack.peek()){ System.out.println("poped )"); stack.pop(); } } break;  
 case ']' : if(stack.empty() == false){ if(']' == stack.peek()){ System.out.println("poped ]"); stack.pop(); } } break;  
 case '}' : if(stack.empty() == false){ if('}' == stack.peek()){ System.out.println("poped }"); stack.pop(); } } break;  
default:  
 return false; } return stack.empty(); } } return false;*/
```

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
