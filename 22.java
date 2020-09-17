class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n, n, res, "");
        return res;
    }
    
    public void helper(int left, int right, List<String> res, String string){
        if (left<0 || right<0){
            return;
        }
        if (left>right){
            return;
        }
        if (left==0 && right==0){
            res.add(string);
            return;
        }
        helper(left-1, right, res, string+"(");
        helper(left, right-1, res, string+")");
    }
}