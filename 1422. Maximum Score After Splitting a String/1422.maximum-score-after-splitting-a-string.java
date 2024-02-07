class Solution {
    public int maxScore(String s) {
        int sum=0;
        int max=0;
        for (int i = 0; i < s.length()-1; i++) {
            sum = sumLeftString(s.substring(0,i+1)) + sumRightString(s.substring(i+1));
            if(sum>=max){
                max=sum;
            }
        }
        return max;
    }
    public int sumLeftString(String str){
        int sum=0;
        int[] numberArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case '1':
                    numberArray[i]=0;
                    break;
                case '0':
                    numberArray[i]=1;
                    break;
                default:
                    break;
            }
            sum=sum+numberArray[i];
        }
        return sum;
    }

    public int sumRightString(String str){
        int sum=0;
        int[] numberArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            numberArray[i]= str.charAt(i) - '0';
        }
        for (int i = 0; i < numberArray.length; i++) {
            sum=sum+numberArray[i];
        }
        return sum;
    }
}
//https://github.com/EmilWijayasekara/
