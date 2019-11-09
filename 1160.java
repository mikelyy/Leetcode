class Solution {
    public int countCharacters(String[] words, String chars) {
        /// store each character in chars
        int alphabet[] = new int[26];
        for (char c: chars.toCharArray()){
            alphabet[c-'a']++;
        }
        
        int count = 0;
        /// check each string in words: if characters 被res characters 包括关系,就可以
        for (String m: words){
            boolean check = true;
            int res[] = Arrays.copyOf(alphabet, alphabet.length);
            for (char c: m.toCharArray()){
                if (--res[c-'a']<0){
                    check = false;
                    break;
                }
            }
            if (check){
                count+=m.length();
            }
        }
        return count;
    }
}