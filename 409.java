class Solution {
    public int longestPalindrome(String s) {
        if (s==null || s.length()<1){
            return 0;
        }
        HashSet<Character> res = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            if (res.contains(s.charAt(i))){
                res.remove(s.charAt(i));
            }
            else{
                res.add(s.charAt(i));
            }
        }
        if (res.size()==0){
            return s.length();
        }
        return s.length()-res.size()+1;
    }
}