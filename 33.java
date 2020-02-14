class Solution {
    public int search(int[] nums, int target) {
        /// binary search
        int left = 0;
        int right = nums.length-1;
        if (nums==null || nums.length==0){
            return -1;
        }
        while (left+1<right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>=nums[0]){
                if (target<nums[mid] && target>=nums[0]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            if (nums[mid]<=nums[nums.length-1]){
                if (target>nums[mid] && target<=nums[nums.length-1]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        if (nums[right]==target){
            return right;
        }
        if (nums[left]==target){
            return left;
        }
        return -1;
    }
}