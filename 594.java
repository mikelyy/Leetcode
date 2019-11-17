class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int m : nums){
            res.put(m, res.getOrDefault(m, 0)+1);
        }
        int output = 0;
        for (int n : res.keySet()){
            if (res.containsKey(n+1)){
                output = Math.max(output, res.get(n)+res.get(n+1));
            }
        }
        return output;
    }
}