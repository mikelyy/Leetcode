class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> res = new HashMap<>();
        res.put(')','(');
        res.put(']','[');
        res.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (!res.containsKey(c)){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.pop()!=res.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}