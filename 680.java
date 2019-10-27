class Solution {
    public boolean validPalindrome(String s) {
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                int point = s.length()-i-1;
                /// remove one element
                return (check(s,i+1,point) || check(s,i,point-1));
            }
        }
        return true;
    }
    
    
    
    public boolean check(String s, int i, int j){
        for (int k=i; k<=i+(j-i)/2; k++){
            if (s.charAt(k)!=s.charAt(j-k+1)){
                return false;
            }
        }
        return true;
    }
    
}