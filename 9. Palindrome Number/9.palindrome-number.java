class Solution {
    public boolean isPalindrome(int x) {
        //Constraints
        if(x<0 || x>2147483647){
            return false;
        }
        //when constraints are satisfied
        else {
            char[] originalNumberArray = (""+x).toCharArray();
            char[] reversed = new char[originalNumberArray.length];
            int arrayLength = originalNumberArray.length-1;

            for (int i = 0; i < originalNumberArray.length; i++) { 
                reversed[arrayLength]=originalNumberArray[i];
                arrayLength--;
            }

            String reversedNumString = new String(reversed);
            System.out.println("String " +reversedNumString);
            long rev = Long.parseLong(reversedNumString);

            if(x==rev){
                System.out.println("True");
                return true;
            }
            else {
                System.out.println("False");
                return false;
            }
        }
    }
}
