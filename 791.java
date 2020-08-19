class Solution {
    public String customSortString(String S, String T) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for (char c : S.toCharArray()){
            for (int i=0; i<T.length(); i++){
                if (c == T.charAt(i)){
                    res.append(c);
                }
                set.add(c);
            }
        }
        for (char d : T.toCharArray()){
            if (!set.contains(d)){
                res.append(d);
            }
        }
        return res.toString();
    }
}