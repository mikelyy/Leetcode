class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // collections.sort
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->map.get(b) - map.get(a));
        
        StringBuilder res = new StringBuilder();
        for (char c : list){
            int n = map.get(c);
            for (int i=0; i<n; i++){
                res.append(c);
            }
        }
        return res.toString();
    }
}