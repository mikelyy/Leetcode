class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            int target = 0-nums[i];
            while (j<k){
                if (nums[j]+nums[k]>target){
                    k--;
                }
                else if (nums[j]+nums[k]<target){
                    j++;
                }
                else{
                    if (!res.contains(Arrays.asList(nums[i],nums[j],nums[k]))){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}