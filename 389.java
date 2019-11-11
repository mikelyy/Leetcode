class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> res = new HashMap<>();
        for (int i=0; i<t.length(); i++){
            res.put(t.charAt(i), res.getOrDefault(t.charAt(i),0)+1);
        }
        for (int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if (res.containsKey(c)){
                res.put(c, res.get(c)-1);
                if (res.get(c)==0){
                    res.remove(c);
                }
            }
        }
        char ans = 'a';
        for (char m : res.keySet()){
            ans = m;
        }
        return ans;
    }
}