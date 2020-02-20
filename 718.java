/// going backward
class Solution {
    public int findLength(int[] A, int[] B) {
        int res = 0;
        int[][] dp = new int[A.length+1][B.length+1];
        for (int i=A.length-1; i>=0; i--){
            for (int j=B.length-1; j>=0; j--){
                if (A[i]==B[j]){
                    dp[i][j] = 1+dp[i+1][j+1];
                    if (dp[i][j]>res){
                        res=dp[i][j];
                    }
                }
            }
        }
        return res;
    }
}