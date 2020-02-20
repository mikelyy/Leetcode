class Solution {
    public int minFlipsMonoIncr(String S) {
        int one=0;
        int zero=0;
        for (int i=0; i<S.length(); i++){
            if (S.charAt(i)=='0'){
                one=Math.min(one,zero)+1;
                zero=zero+0;
            }
            else{
                one=Math.min(one,zero)+0;
                zero=zero+1;
            }
        }
        return Math.min(zero,one);
    }
}