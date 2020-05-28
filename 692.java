class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        List<String> res = new ArrayList(map.keySet());
        Collections.sort(res, (a,b)->map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b)-map.get(a));
        return res.subList(0,k);
    }
}