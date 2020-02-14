class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int temp_sum = 0;
        for (int i=0; i<nums.length; i++){
            temp_sum = 0;
            for (int j=i; j<nums.length; j++){
                temp_sum += nums[j];
                if (temp_sum == k){
                    res+=1;
                }
            }
        }
        return res;
    }
}