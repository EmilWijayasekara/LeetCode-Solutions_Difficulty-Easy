class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a,b;
        a=coordinates.charAt(0);
        b=coordinates.charAt(1)-'0';

        if((a+b)%2 == 0) return false;
        else return true;
    }
}
//  https://github.com/EmilWijayasekara
