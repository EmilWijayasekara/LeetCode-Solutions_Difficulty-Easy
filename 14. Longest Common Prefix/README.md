
# LeetCode Practice  (Day 4)
## Achievements
[![Leetcode-copy.jpg](https://i.postimg.cc/WzrtR30J/Leetcode-copy.jpg)](https://postimg.cc/5Q4fLf7x)

## About the problem
- *Problem Number* : 14
- *Problem Name* :  [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)
- *Problem difficulty* : Easy (41.91%) 🟢
- *Category* : Algorithms
- *Programming language used* - Java

## Problem


Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string  `""`.

**Example 1:**

```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

**Example 2:**

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

**Constraints:**

-   `1 <= strs.length <= 200`
-   `0 <= strs[i].length <= 200`
-   `strs[i]`  consists of only lowercase English letters.

## Approach Explanation
First, filter out the empty String arrays and return `""`.
Then I sorted the array, and from this I can get the alphabetical order of the string array. for example 

```
example 1
original String  = ["flower", "flow", "flight"]
after the sort = ["flight", "flow", "flower"]

example 2
original String  = ["Emil", "Ashi", "Thimira"]
after the sort = ["Ashi","Emil","Thimira"]
```

From this, I can compare just the first word and last word in the string. Because the words in between are always sorted accordingly. Then just using a while loop I compared the first and last word in the string array. Then just using a while loop I compared the first and last word in the string array. If both words have the same letters then increment the counter variable, otherwise we break from the loop. If the counter variable value is equal to zero that means there is no common prefix in these strings, then we must return `""`. If the counter value is greater than zero, then using `substring()` method we return common prefix 

## Earlier attempts
```cpp
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String array[] = {"Emil","Ashi","Thimira"};
        System.out.println(longestCommonPrefix(array));
        //System.out.println(array[0].substring(0,3));
        //longestCommonPrefix(array);
        //System.out.println(Arrays.toString(array)); {"Emil","Ashi","Thimira"}; {"High","Hinata","Hiking"} "dog","racecar","car"
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0 || strs == null){
            return "";
        }

        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]+", ");
        }

        Arrays.sort(strs);
        System.out.println("\n-------------------");
        for (int i = 0; i < strs.length; i++) {

            System.out.print(strs[i]+", ");
        }

        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];
        int counter = 0;

        while (counter<firstWord.length()){
            if(firstWord.charAt(counter) == lastWord.charAt(counter)){
                counter++;
            }
            else {
                break;
            }
        }
        if(counter==0){
            return "";
        }
        else {
            return firstWord.substring(0,counter);
        }



        /*StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();*/

        /*String word= strs[0];
        int count=0;
        if(word.length()==1){
            return strs[0];
        }
        if(word.isEmpty())
            return "";
        if (word.charAt(0) != strs[1].charAt(0)){
            return "";
        }else {
            for (int i = 0; i < strs.length; i++) {
                if(word.charAt(i) == strs[i].charAt(i)){
                    count++;
                }
            }
        }
        return word.substring(0,count);*/
    }
}
```

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
