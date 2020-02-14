class Solution {
    public int uniquePathsWithObstacles(int[][] obstackleGrid) {
        ///dp
        int m = obstackleGrid.length;
        int n = obstackleGrid[0].length;
        if (obstackleGrid[0][0]==1){
            return 0;
        }
        obstackleGrid[0][0]=1;
        for (int i=1; i<m; i++){
            if (obstackleGrid[i][0]==0 && obstackleGrid[i-1][0]==1){
                obstackleGrid[i][0]=1;
            }
            else{
                obstackleGrid[i][0]=0;
            }
        }
        for (int j=1; j<n; j++){
            if (obstackleGrid[0][j]==0 && obstackleGrid[0][j-1]==1){
                obstackleGrid[0][j]=1;
            }
            else{
                obstackleGrid[0][j]=0;
            }
        }
        for (int k=1; k<m; k++){
            for (int l=1; l<n; l++){
                if (obstackleGrid[k][l]==0){
                    obstackleGrid[k][l] = obstackleGrid[k-1][l] + obstackleGrid[k][l-1];
                }
                else{
                    obstackleGrid[k][l]=0;
                }
            }
        }
        return obstackleGrid[m-1][n-1];
    }
}