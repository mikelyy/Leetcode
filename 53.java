/// a<0 update a to be nums[i]
/// a>=0 update a to be adding nums[i]
/// 

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums==null){
            return 0;
        }
        int a=nums[0];
        int b=nums[0];
        for (int i=1; i<nums.length; i++){
            if (a<0){
                a=nums[i];
            }
            else{
                a+=nums[i];
            }
            b=Math.max(b,a);
        }
        return b;
    }
}