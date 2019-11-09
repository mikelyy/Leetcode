class Solution {
    public String[] findWords(String[] words) {
        if (words==null || words.length==0){
            return new String[0];
        }
        
        String[] check = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<Set<Character>> output = new ArrayList<>();
        for (int i=0; i<3; i++){
            Set<Character> res = new HashSet();
            for (char c: check[i].toCharArray()){
                res.add(c);
            }
            /// res= q w e r t y u i o p, a s d f g h j k l, z x c v b n m
            output.add(res);
        }
        /// output= [q w e r t y u i o p, a s d f g h j k l, z x c v b n m]
        
        List<String> result = new ArrayList<>();
        
        for (String w: words){
            String w_updated = w.toLowerCase();
            /// w_updated = "hello", "alaska", "dad", "peace"
            char first = w_updated.charAt(0);
            /// first = h, a , d, p
            int indexpoint = 0;
            for (int i=0; i<3; i++){
                if (output.get(i).contains(first)){
                    indexpoint = i;
                    /// 判断这个词是在123中的第几行
                }
            }
            
            boolean valid = true;
            for (char c: w_updated.toCharArray()){
                /// w_updated = h e l l o, a l a s k a, d a d, p e a c e
                if (output.get(indexpoint).contains(c)){
                    continue;
                    /// if all characters in each word is covered by this row, then continue
                }

                else{
                    valid = false;
                    break;
                }
            }
            
            if (valid){
                result.add(w);
            }
        }
        return result.toArray(new String[0]);
    }
}