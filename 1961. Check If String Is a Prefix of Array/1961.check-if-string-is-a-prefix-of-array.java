class Solution {
    public boolean isPrefixString(String s, String[] words) {
        if(s.length()<words[0].length()) return false;
        String wordString = "";
        for (int i = 0; i < words.length; i++) {
            if(s.indexOf(words[i])==-1) return false;
            wordString = wordString+words[i];
            if(s.equals(wordString)) return true;
        }
        return false;
    }
}

