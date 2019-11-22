class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> res = new Stack();
        StringBuilder result = new StringBuilder();
        for (char c : S.toCharArray()){
            if (!res.isEmpty() && c == res.peek()){
                /// stack.peek() returns the top element in the stack
                res.pop();
            }
            else{
                res.push(c);
            }
        }
        while (!res.isEmpty()){
            result.append(res.pop());
        }
        return result.reverse().toString();
    }
}