class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        // sliding window
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 2;
        int a = 0;
        int b = 0;
        if (s.length()<3){
            return s.length();
        }
        while (b<s.length()){
            int index = 0;
            if (map.size()<=2){
                map.put(s.charAt(b), b);
                b++;
            }
            if (map.size()==3){
                // find index and delete the one with least frequency in the map
                // Collections.min
                index = Collections.min(map.values());
                map.remove(s.charAt(index));
                // move a to rightward
                a = index+1;
            }
            res = Math.max(res, b-a);
        }
        return res;
    }
}