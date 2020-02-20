class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int len=A.length;
        int res_a = 0;
        int res_b = 0;
        res_a = helper(A[0], A, B, len);
        if (res_a!=-1 || A[0]==B[0]){
            return res_a;
        }
        else{
            res_b = helper(B[0], A, B, len);
            return res_b;
        }
    }
    
    public int helper(int target, int[]A, int[] B, int len){
        int a=0;
        int b=0;
        for (int i=0; i<len; i++){
            if (A[i]!=target && B[i]!=target){
                return -1;
            }
            else if(A[i]!=target){
                a++;
            }
            else if(B[i]!=target){
                b++;
            }
            else{
                continue;
            }
        }
        return Math.min(a,b);
    }
    
}
