class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)){
            return -1;
        }
        if (a.length()==b.length() && a!=b){
            return a.length();
        }
        return Math.max(a.length(),b.length());
    }
}