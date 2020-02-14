class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length==0 || nums==null){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        helper(nums, res, subset, 0);
        return res;
    }
    
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> subset, int currindex){
        res.add(new ArrayList<>(subset));
        for (int i=currindex; i<nums.length; i++){
            subset.add(nums[i]);
            helper(nums, res, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }
}