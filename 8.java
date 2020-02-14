class Solution {
    public int myAtoi(String str) {
        str = str.trim(); // 1. Extra space at the start and end of the string
        if (str.length() == 0) return 0; //2. Empty (0 length) string
        int sign = 1;
        int i = 0;
        if (str.charAt(0) == '-') {
            sign = -1; //3. sign bit if exists
            i++;
        } else if (str.charAt(0) == '+') {
            sign = 1;
            i++;
        }
        int ans = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int newAns = ans * 10 + (str.charAt(i) - '0');
            if (newAns/10 != ans) {
                if (sign==-1){
                    return Integer.MIN_VALUE;
                }
                else{
                    return Integer.MAX_VALUE;
                }
            }
            ans = newAns;
            i++;
        }
        return ans * sign;
    }
}