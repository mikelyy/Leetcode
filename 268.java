class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i+1]!=nums[i]+1){
                res = nums[i]+1;
            }
        }
        return res;
    }
}