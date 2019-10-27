class Solution {
    public int countSegments(String s) {
        int count = 1;
        for (int i=1; i<s.length(); i++){
            if ((s.charAt(i-1) == ' ') && (s.charAt(i) != ' ')){
                count++;
            }
        }
        return count;
    }
}