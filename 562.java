class Solution {
    public int longestLine(int[][] M) {
        int res = 0;
        if (M.length==0 || M[0].length==0){
            return 0;
        }
        int[][][] dp = new int[M.length][M[0].length][4];
        for (int i=0; i<M.length; i++){
            for (int j=0; j<M[0].length; j++){
                if (M[i][j]==1){
                    if (j>0){
                        dp[i][j][0]=dp[i][j-1][0]+1;
                    }
                    else{
                        dp[i][j][0]=1;
                    }
                    if (i>0){
                        dp[i][j][1]=dp[i-1][j][1]+1;
                    }
                    else{
                        dp[i][j][1]=1;
                    }
                    if (i>0 && j>0){
                        dp[i][j][2]=dp[i-1][j-1][2]+1;
                    }
                    else{
                        dp[i][j][2]=1;
                    }
                    if (i>0 && j<M[0].length-1){
                        dp[i][j][3]=dp[i-1][j+1][3]+1;
                    }
                    else{
                        dp[i][j][3]=1;
                    }
                    res=Math.max(res, Math.max(Math.max(Math.max(dp[i][j][0], dp[i][j][1]), dp[i][j][2]), dp[i][j][3]));
                }
            }
        }
        return res;
    }
}