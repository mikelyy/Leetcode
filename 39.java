class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, temp, candidates, target, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> temp, int[] candidates, int remain, int start){
        /// start is to avoid case (223, 232, 322)
        if (remain==0){
            res.add(new ArrayList<>(temp));
        }
        if (remain>0){
            for (int i=start; i<candidates.length; i++){
                temp.add(candidates[i]);
                helper(res, temp, candidates, remain-candidates[i], i);
                temp.remove(temp.size()-1);
            }
        }
    }
}