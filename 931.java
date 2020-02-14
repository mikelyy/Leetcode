class Solution {
    public int minFallingPathSum(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] dp = new int[m][n];
        for (int i=0; i<n; i++){
            dp[0][i] = A[0][i];
        }
        for (int j=1; j<m; j++){
            for (int k=0; k<n; k++){
                if (k==0){
                    dp[j][k] = A[j][k] + Math.min(dp[j-1][k], dp[j-1][k+1]);
                }
                else if (k==n-1){
                    dp[j][k] = A[j][k] + Math.min(dp[j-1][k], dp[j-1][k-1]);
                }
                else{
                    dp[j][k] = A[j][k] + Math.min(dp[j-1][k-1], Math.min(dp[j-1][k], dp[j-1][k+1]));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int q: dp[m-1]){
            res = Math.min(res, q);
        }
        return res;
    }
}