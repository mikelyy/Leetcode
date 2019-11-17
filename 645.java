class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap();
        for (int m : nums){
            res.put(m, res.getOrDefault(m, 0)+1);
        }
        int result1 = 0;
        int result2 = 0;
        for (int i=1; i<=nums.length; i++){
            if (res.containsKey(i)){
                if (res.get(i)==2){
                    result1 = i;
                }
            }
            else{
                result2 = i;
            }
        }
        return new int[]{result1, result2};
    }
}