class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){
            return 0;
        }
        int needle_length = needle.length();
        int haystack_length = haystack.length();
        for (int i=0; i<haystack_length-needle_length; i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                /// .equals() check if the values are same
                /// == check if point to same memory location
                if (haystack.substring(i, i+needle_length).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}