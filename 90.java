/// backtracking
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums==null || nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> subset = new LinkedList<>();
        helper(nums, 0, res, subset);
        return res;
    }
    
    public void helper(int[] nums, int index, List<List<Integer>> res, List<Integer> subset){
        res.add(new LinkedList<>(subset));
        for (int i=index; i<nums.length; i++){
            if (i!=index && nums[i]==nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            helper(nums, i+1, res, subset);
            subset.remove(subset.size()-1);
        }
    }
    
}