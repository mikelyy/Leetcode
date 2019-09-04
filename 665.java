/// if (count==0) ... count=1;
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]>nums[i+1]){
                if (count==0){
                    if (i!=0){
                        if (nums[i-1]<nums[i+1]){
                            nums[i]=nums[i-1];
                        }
                        else{
                            nums[i+1]=nums[i];
                        }
                    }
                    count=1;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}