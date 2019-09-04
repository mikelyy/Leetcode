/// find the largest value
/// any other value in the array * 2 is greater than largest value while that value is not the largets value itself

class Solution {
    public int dominantIndex(int[] nums) {
        int index=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]>nums[index]){
                index=i; 
            }
        }
        for (int j=0; j<nums.length; j++){
            if (nums[j]*2>nums[index] && j!=index){
                return -1;
            }
        }
        return index;
    }
}