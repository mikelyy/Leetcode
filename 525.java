class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0;
        int temp = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                temp += 1;
            }
            else{
                temp -= 1;
            }
            if (map.containsKey(temp)){
                res = Math.max(res, i-map.get(temp));
            }
            else{
                map.put(temp, i);
            }
        }
        return res;
    }
}