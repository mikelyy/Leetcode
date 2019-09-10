class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int number=0;

        for (int i=0; i<nums.length; i++){
            /// if not 1, reset count=0
            if (nums[i]!=1){
                count=0;
            }
            else{
                /// store the number of 1 each time
                count++;
                /// store the maximum value into number, if new count is greater than current maximum value, then update it to number
                number=Math.max(count, number);
            }
        }
        return number;
    }
}
/// count=2 & 写入number=2 to store the current value, count=0, count=3, update number to 3