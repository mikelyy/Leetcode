class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len_s = s.length();
        for (int i=1; i<s.length(); i++){
            /// i=2 abc
            if (len_s % i ==0){
                /// sub_s = 'abc'
                String sub_s = s.substring(0,i);
                /// split_s = ['abc', 'abc', 'abc', 'abc']
                String[] split_s = s.split(sub_s);
                if (split_s.length==0){
                    return true;
                }
            }
        }
        return false;
    }
}