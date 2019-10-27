class Solution {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        for (int i=0; i<s.length(); i+=2*k){
            int j=i;
            /// s.length()-1 is the case for full space
            /// i+k is the case for not enough full space
            int m=Math.min(s.length()-1, i+k-1);
            /// reverse
            while (j<m){
                char tmp=res[j];
                res[j++]=res[m];
                res[m--]=tmp;
            }
        }
        return new String(res);
    }
}