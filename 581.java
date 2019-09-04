class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] numscopy=nums.clone();
        Arrays.sort(numscopy);
        
        int end=0;
        int begin=numscopy.length;
        int count=0;
        
        for (int i=0; i<numscopy.length; i++){
            if (nums[i]!=numscopy[i]){
                begin=Math.min(begin, i);
                end=Math.max(end, i);
            }
        }
        if (end-begin>=0){
            count=end-begin+1;
        }
        return count;
    }
}