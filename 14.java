class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        for (int i=0; i<strs[0].length(); i++){
            /// i = 0 1 2 3 4 5
            char c = strs[0].charAt(i);
            /// c = f l o w e r
            for (int j=1; j<strs.length; j++){
                /// j = 1 2
                if (i==strs[j].length() || strs[j].charAt(i)!=c){
                    /// i==strs[j].length() is for string index out of range
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}