class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        for (int i=0; i<nums.length-2; i++){
            res += helper(nums, target-nums[i], i+1);
        }
        return res;
    }
    
    public int helper(int[] nums, int target, int start){
        int res = 0;
        int left = start;
        int right = nums.length-1;
        while (left<right){
            if (nums[left]+nums[right]<target){
                res+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}