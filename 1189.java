class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> M = new HashMap<>();
        M.put('b',1);
        M.put('a',1);
        M.put('l',2);
        M.put('o',2);
        M.put('n',1);
        /// M is balloon now
        
        String b = "balloon";
        int[] res = new int[26];
        for (char c: text.toCharArray()){
            /// get number of occurance of each index of c in text
            res[c-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for (char c: b.toCharArray()){
            if (M.containsKey(c)){
                ans = Math.min(ans, res[c-'a']/M.get(c));
            }
        }
        return ans;   
    }
}