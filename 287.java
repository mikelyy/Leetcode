class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<Integer>();
        for (int n: nums){
            if (res.contains(n)){
                return n;
            }
            res.add(n);
        }
        return -1;
    }
}