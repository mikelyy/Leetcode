/// review
class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        
        Arrays.sort(nums);
        int count=0;
        for (int j=nums.length-1; j>0; j--){
            if (nums[j]!=nums[j-1]){
                count++;
            }
            if (count==2){
                return nums[j-1];
            }
        }
        return nums[nums.length-1];
    }
}