// charAt: The charAt() method returns the character at the specified index in a string.
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0){
            return true;
        }
        if(t.length()==0 && s.length()!=0){
            return false;
        }
        
        for (int i=0; i<s.length()-1; i++){
            for (int j=0; j<t.length()-1; j++){
                if (s.charAt(i)==t.charAt(j)){
                    i++;
                }
                if (i==s.length()-1){
                    return true;
                }
            }
        }
        return false;
    }
}