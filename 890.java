class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new LinkedList();
        for (String word : words){
            if (helper(word, pattern)){
                res.add(word);
            }
        }
        return res;
    }
    
    public boolean helper(String word, String pattern){
        HashMap<Character, Character> map_w = new HashMap<>();
        HashMap<Character, Character> map_p = new HashMap<>();
        for (int i=0; i<word.length(); i++){
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!map_w.containsKey(w)){
                map_w.put(w,p);
            }
            if (!map_p.containsKey(p)){
                map_p.put(p,w);
            }
            if (map_w.get(w) != p || map_p.get(p) != w){
                return false;
            }
        }
        return true;
    }
}