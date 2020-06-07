class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum-k)){
                res = Math.max(res, i-map.get(sum-k));
            }
            if (!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        if (res == Integer.MIN_VALUE){
            return 0;
        }
        else{
            return res;
        }
    }
}