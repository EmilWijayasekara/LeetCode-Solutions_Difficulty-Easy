import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0 || strs == null){
            return "";
        }
        Arrays.sort(strs);
        int counter = 0;

        while (counter<strs[0].length()){
            if(strs[0].charAt(counter) == strs[strs.length-1].charAt(counter)){
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
            return strs[0].substring(0,counter);
        }
    }
}
//https://github.com/EmilWijayasekara
