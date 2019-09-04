/// double 小数
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int j=0; j<k; j++){
            sum+=nums[j];
        }
        double max=sum;
       
        for (int i=k; i<nums.length; i++){
            sum+=nums[i]-nums[i-k];
            max=Math.max(sum, max);
        }
        
        return max/k;
    }
}