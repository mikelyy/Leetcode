class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs==null || strs.length==0){
            return res;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c); 
            if (!map.containsKey(s)){
                List<String> temp = new ArrayList<>();
                temp.add(str);
                res.add(temp);
                map.put(s,res.size());
            }
            else{
                List<String> temp = res.get(map.get(s)-1);
                temp.add(str);
            }
        }
        return res;
    }
}