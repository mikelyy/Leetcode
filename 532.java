/// review
/// i=j for unique case

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums.length==0 || k<0 || nums==null){
            return 0;
        }
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j=0;
        while (j<nums.length){
            if (i==j){
                j++;
            }
            else if (nums[i]+k==nums[j]){
                count++;
                while (j<nums.length-1 && nums[j]==nums[j+1]){
                    j++;
                }
                j++;
            }
            else if (nums[i]+k>nums[j]){
                j++;
            }
            else if (nums[i]+k<nums[j]){
                i++;
            }
        }
        return count;
    }
}