class Solution {
    public int findMin(int[] nums) {
        for (int i=nums.length-1; i>0; i--){
            if (nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}