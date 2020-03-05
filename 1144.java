/// review !!!
class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int odd = 0;
        int even = 0;
        int max = 0;
        int len = nums.length;
        if (len<3){
            return 0;
        }
        for (int i=1; i<nums.length; i+=2){
            if (i==nums.length-1){
                max=nums[i-1];
            }
            else{
                max=Math.min(nums[i-1], nums[i+1]);
            }
            if (nums[i]>=max){
                odd+=1+nums[i]-max;
            }
        }
        for (int i=0; i<nums.length; i+=2){
            if (i==0){
                max=nums[i+1];
            }
            else if(i==nums.length-1){
                max=nums[i-1];
            }
            else{
                max=Math.min(nums[i-1], nums[i+1]);
            }
            if (nums[i]>=max){
                even+=1+nums[i]-max;
            }
        }
        return Math.min(odd, even);
    }
}