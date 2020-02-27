class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    
    public void helper(int[] candidates, int target, int index, List<Integer>list){
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i=index; i<candidates.length; i++){
            if (i==index || candidates[i]!=candidates[i-1]){
                list.add(candidates[i]);
                helper(candidates, target-candidates[i], i+1, list);
                list.remove(list.size()-1);
            }
        }
    }
}