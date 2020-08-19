class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> left = new HashMap<>();
        HashMap<Character, Integer> right = new HashMap<>();
        int res = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            left.put(c, left.getOrDefault(c,0)+1);
        }
        for (int j=s.length()-1; j>=0; j--){
            char d = s.charAt(j);
            right.put(d, right.getOrDefault(d,0)+1);
            left.put(d, left.get(d)-1);
            if (left.get(d) == 0){
                left.remove(d);
            }
            if(left.size() == right.size()){
                res+=1;
            }
        }
        return res;
    }
}