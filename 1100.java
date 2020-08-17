class Solution {
    public int numKLenSubstrNoRepeats(String S, int K) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (K>S.length()){
            return 0;
        }
        int start = 0;
        int res = 0;
        for (int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if (map.containsKey(c) && start<=map.get(c)){
                start = map.get(c)+1;
            }
            map.put(c,i);
            if (i-start+1==K){
                res+=1;
                start+=1;
            }
        }
        return res;
    }
}