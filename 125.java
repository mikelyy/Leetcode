class Solution {
    public boolean isPalindrome(String s) {
        /// [^a-zA-Z_0-9] represents not number & not alphabet
        s=s.replaceAll("[^a-zA-Z_0-9]", "").toLowerCase();
        int a=0;
        int b=s.length()-1;
        while(a<b){
            if (s.charAt(a)==s.charAt(b)){
                a++;
                b--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}