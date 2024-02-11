public class Solution {
    HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i] , hashMap.getOrDefault(nums[i],0)+1);
        }

        for (int i : hashMap.keySet()){
            if(hashMap.get(i)==1){
                sum = sum + i;
            }
        }
        return sum;
}
