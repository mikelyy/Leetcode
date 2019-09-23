/// throw new IllegalArgumentException("No two sum solution") 表明向方法传递了一个不合法或不正确的参数
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}