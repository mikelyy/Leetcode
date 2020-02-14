class Solution {
    public int threeSumClosest(int[] nums, int target) {
        ///bst
        int compare = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (Math.abs(target-sum)<Math.abs(target-compare)){
                    compare = sum;
                }
                if (sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return compare;
    }
}