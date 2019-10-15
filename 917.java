class Solution {
    public String reverseOnlyLetters(String S) {
        /// create a new stack
        Stack<Character> res = new Stack();
        for (char c: S.toCharArray()){
            if (Character.isLetter(c)){
                res.push(c);
            }
        }
        /// create a new string
        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()){
            if (Character.isLetter(c)){
                ans.append(res.pop());
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}