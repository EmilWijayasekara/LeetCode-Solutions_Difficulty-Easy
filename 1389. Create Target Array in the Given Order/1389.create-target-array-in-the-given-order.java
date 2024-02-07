class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i],nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arrayList.get(i);
        }
        return nums;
    }
}
// https://github.com/EmilWijayasekara
