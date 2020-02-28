/// dp
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int res = 0;
        int a = mat.length;
        int b = mat[0].length;
        int[][] dp = new int[a+1][b+1];
        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+mat[i-1][j-1];
            }
        }
        for (int diff=Math.min(a,b); diff>=1; diff--){
            for (int i=1; i+diff<=a; i++){
                for (int j=1; j+diff<=b; j++){
                    if (dp[i+diff][j+diff]-dp[i-1][j+diff]-dp[i+diff][j-1]+dp[i-1][j-1]<=threshold){
                        return diff+1;
                    }
                }
            }
        }        
        return 0;
    }
}