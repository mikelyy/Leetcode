class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0 || nums==null){
            return 0;
        }
        int start = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            while (sum>=s){
                res = Math.min(res, i-start+1);
                sum -= nums[start];
                start+=1;
            }
        }
        return res == Integer.MAX_VALUE ? 0: res;
    }
}