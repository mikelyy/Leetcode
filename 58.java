class Solution {
    public int lengthOfLastWord(String s) {
        String notexist = s.trim();
        if (notexist.isEmpty()){
            return 0;
        }
        else{
            int a = s.lastIndexOf(" ");
            String res = s.substring(a+1);
            return res.length();
        }
    }
}