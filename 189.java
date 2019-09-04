/// learn #1

class Solution {
    public void rotate(int[] nums, int k) {
        k = (nums.length+(k%nums.length))%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        for (int i=start, j=end; i<j; i++, j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        
        }
    }
}

/// learn #2
class Solution {
    public void rotate(int[] nums, int k) {
        int[] a=new int[nums.length];
        for (int i=0; i<nums.length; i++){
            a[(i+k) % nums.length] = nums[i];
        }
        for (int i=0; i<nums.length; i++){
            nums[i]=a[i];
        }
    }
}

/// learn #3
