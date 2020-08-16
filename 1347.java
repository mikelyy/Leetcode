class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int res = 0;
        for (char c: t.toCharArray()){
            if (map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.getOrDefault(c,0)-1);
            }
            else{
                res+=1;
            }
        }
        return res;
    }
}