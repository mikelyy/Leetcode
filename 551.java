class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        char[] res = s.toCharArray();
        for (char c : res){
            if (c=='A'){
                countA+=1;
            }
        }
        for (int i=0; i<s.length()-1; i++){
            if (s.charAt(i)=='L' && s.charAt(i+1)=='L'){
                countL+=1;
            }
        }
        if (countA>1 || countL>1){
            return false;
        }
        return true;
    }
}