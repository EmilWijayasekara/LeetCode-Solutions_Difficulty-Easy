class Solution {
    public boolean makeEqual(String[] words) {
        if (words.length == 1) return true;
        
        int characterCount = 0;
        for(String s : words){
            characterCount = characterCount + s.length();
        }
        
        if(characterCount % words.length != 0){
            return false;
        }
        
        int[] count =  new int[26];
        for (String s : words){
            for (char c : s.toCharArray()){
                count[c-'a']++;
            }
        }
        
        for (int i : count){
            if(i% words.length != 0){
                return false;
            }
        }
        return true; 
    }
}
