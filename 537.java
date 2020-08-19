class Solution {
    public String complexNumberMultiply(String a, String b) {
        /// +|i is + or i
        String[] x = a.split("\\+|i");
        String[] y = b.split("\\+|i");
        int m = Integer.parseInt(x[0]); 
        int n = Integer.parseInt(x[1]); 
        int p = Integer.parseInt(y[0]);  
        int q = Integer.parseInt(y[1]); 
        int multi_1 = m*p;
        int multi_3 = n*q;
        int multi_2 = m*q+n*p;
        int res_1 = multi_1-multi_3;
        String res = Integer.toString(res_1) + "+" + Integer.toString(multi_2) + "i";
        return res;
    }
}