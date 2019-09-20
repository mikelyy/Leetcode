/// review
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int temp = 0;
        
        for (int i=0; i<nums.length; i++){
            if (i>0 && nums[i-1]>=nums[i]){
                temp=i;
            }
            count = Math.max(count, i-temp+1);
        }
        return count;
    }
}