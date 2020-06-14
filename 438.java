class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int s_len = s.length();
        int p_len = p.length();
        List<Integer> res = new LinkedList<>();
        HashMap<Character, Integer> p_map = new HashMap<>();
        for (char c : p.toCharArray()){
            if (p_map.containsKey(c)){
                p_map.put(c, p_map.get(c)+1);
            }
            else{
                p_map.put(c, 1);
            }
        }
        HashMap<Character, Integer> s_map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char m = s.charAt(i);
            if (s_map.containsKey(m)){
                s_map.put(m, s_map.get(m)+1);
            }
            else{
                s_map.put(m,1);
            }
            if (i>=p.length()){
                m = s.charAt(i-p_len);
                if (s_map.get(m)!=1){
                    s_map.put(m, s_map.get(m)-1);
                }
                else{
                    s_map.remove(m);
                }
            }
            if (s_map.equals(p_map)){
                res.add(i+1-p_len);
            }
        }
        return res;
    }
}