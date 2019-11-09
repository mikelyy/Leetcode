class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> res = new HashMap();
        for (String m: A.split(" ")){
            res.put(m, res.getOrDefault(m,0)+1);
        }
        for (String m: B.split(" ")){
            res.put(m, res.getOrDefault(m,0)+1);
        }
        List<String> output = new ArrayList();
        for (String m: res.keySet()){
            if (res.get(m)==1){
                output.add(m);
            }
        }
        return output.toArray(new String[0]);
    }
}