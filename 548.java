/// review !!!
class Solution {
    public boolean splitArray(int[] nums) {
        if (nums.length<7){
            return false;
        }
        int[] res = new int[nums.length];
        res[0]=nums[0];
        for (int i=1; i<nums.length; i++){
            res[i]=res[i-1]+nums[i];
        }
        for (int j=3; j<nums.length-3; j++){
            HashSet<Integer> set = new HashSet<>();
            for (int i=1; i<j-1; i++){
                if (res[i-1]==res[j-1]-res[i]){
                    set.add(res[i-1]);
                }
            }
            for (int k=j+2; k<nums.length-1; k++){
                if (res[nums.length-1]-res[k]==res[k-1]-res[j] && set.contains(res[nums.length-1]-res[k])){
                    return true;
                }
            }
        }
        return false;
    }
}