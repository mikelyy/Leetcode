class Solution {
    public int movesToMakeZigzag(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int[] nums1 = nums.clone();
        int[] nums2 = nums.clone();
        int count1 = 0;
        int count2 = 0;
        for (int i=1; i<nums1.length; i++){
            if (i%2==1){
                if (nums1[i]>=nums1[i-1]){
                    int moves = nums1[i]-(nums1[i-1]-1);
                    count1+=moves;
                    nums1[i]=nums1[i-1]-1;
                }
            }
            else{
                if (nums1[i]<=nums1[i-1]){
                    int moves = nums1[i-1]-(nums1[i]-1);
                    count1+=moves;
                    nums1[i-1]=nums1[i]-1;
                }
            }
        }

        for (int i=1; i<nums2.length; i++){
            if (i%2==0){
                if (nums2[i]>=nums2[i-1]){
                    int moves = nums2[i]-(nums2[i-1]-1);
                    count2+=moves;
                    nums2[i]=nums2[i-1]-1;
                }
            }
            else{
                if (nums2[i]<=nums2[i-1]){
                    int moves = nums2[i-1]-(nums2[i]-1);
                    count2+=moves;
                    nums2[i-1]=nums2[i]-1;
                }
            }
        }
        return Math.min(count1, count2);
    }
}