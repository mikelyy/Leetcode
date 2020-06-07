class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] res = new String[queries.length];
        HashMap<String, String> capitalization = new HashMap<>();
        HashMap<String, String> vowel = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (String word : wordlist){
            set.add(word);
            String word_lower = word.toLowerCase();
            if (!capitalization.containsKey(word_lower)){
                capitalization.put(word_lower, word);
            }
            String word_vowel = helper(word_lower);
            if (!vowel.containsKey(word_vowel)){
                vowel.put(word_vowel, word);
            }
        }
        for (int i=0; i<queries.length; i++){
            String query = queries[i];
            String query_lower = query.toLowerCase();
            String query_vowel = helper(query_lower);
            if (set.contains(query)){
                res[i] = query;
            }
            else if (capitalization.containsKey(query_lower)){
                res[i] = capitalization.get(query_lower);
            }
            else if (vowel.containsKey(query_vowel)){
                res[i] = vowel.get(query_vowel);
            }
            else{
                res[i] = "";
            } 
        }
        return res;
        
    }
    
    private String helper(String word_lower){
        StringBuilder res = new StringBuilder();
        for (char c : word_lower.toCharArray()){
            if (check(c)){
                res.append('*');
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
    
    private boolean check(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}