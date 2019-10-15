class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        /// a: 2, b: 1
        for (char x :  magazine.toCharArray()){
            alphabet[x-'a']++;
        }
        /// a : 2
        /// b : 1
        for (char y : ransomNote.toCharArray()){
            alphabet[y-'a']--;
        }
        /// 
        for (int i=0; i<alphabet.length; i++){
            if (alphabet[i]<0){
                return false;
            }
        }
        return true;
    }
}