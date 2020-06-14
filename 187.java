class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        int len = s.length();
        int a = 10;
        HashSet<String> res = new HashSet<>();
        for (int i=0; i<len-a+1; i++){
            String sliding_window = s.substring(i,i+a);
            if (set.contains(sliding_window)){
                res.add(sliding_window);
            }
            set.add(sliding_window);
        }
        List<String> output = new ArrayList<String>(res);
        return output;
    }
}