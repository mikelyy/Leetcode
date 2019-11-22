class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> res = new Stack();
        List<Character> output = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (char c : S.toCharArray()){
            if (c=='('){
                res.push(c);
                output.add(c);
            }
            else{
                res.pop();
                output.add(c);
            }
            if (res.isEmpty()){
                for (int i=1; i<output.size()-1; i++){
                    result.append(output.get(i));
                }
                output.clear();
            }
        }
        return result.toString();
    }
}