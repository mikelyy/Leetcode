class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> resS = new Stack<>();
        Stack<Character> resT = new Stack<>();
        for (char c : S.toCharArray()){
            if (c!='#'){
                resS.push(c);
            }
            else if (!resS.isEmpty()){
                resS.pop();
            }
        }
        for (char c : T.toCharArray()){
            if (c!='#'){
                resT.push(c);
            }
            else if (!resT.isEmpty()){
                resT.pop();
            }
        }
        if (resS.size()!=resT.size()){
            return false;
        }
        while(!resS.isEmpty()){
            if (resS.pop()!=resT.pop()){
                return false;
            }
        }
        return true;
    }
}