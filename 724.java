/// int x: nums 遍历nums中的每一个value
/// update leftsum after each time loop
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        for (int x: nums){
            sum+=x;
        }
        for (int i=0; i<nums.length; i++){
            if(leftsum==sum-leftsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}