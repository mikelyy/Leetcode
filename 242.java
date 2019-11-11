    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] res_1 = new int[26];
        for (int i=0; i<s.length(); i++){
            res_1[s.charAt(i)-'a']++;
        }
        for (int j=0; j<t.length(); j++){
            res_1[t.charAt(j)-'a']--;
            if (res_1[t.charAt(j)-'a']<0){
                return false;
            }
        }
        return true;
    }
}