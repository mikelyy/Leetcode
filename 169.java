class Solution {
    public int majorityElement(int[] nums) {
        int halflen = nums.length/2;
        int count = 0;
        int res = 0;
        for (int x: nums){
            for (int i=0; i<nums.length; i++){
                if (nums[i]==x){
                    count+=1;
                }
            }
            if (count>halflen){
                res = x;
            }
        }
        return res;
    }
}