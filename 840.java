class Solution {
    
    public int numMagicSquaresInside(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;
        int res = 0;
        for (int i=0; i<a-2; i++){
            for (int j=0; j<b-2; j++){
                if (check(grid, i, j)){
                    res++;
                }
            }
        }
        return res;
    }
    
    
    public boolean check(int[][] grid, int i, int j){
        if (grid[i+1][j+1] != 5){
            return false;
        }
        if ((grid[i][j] % 2 != 0) || (grid[i][j+2] % 2 != 0) || (grid[i+2][j] % 2 != 0) || (grid[i+2][j+2] % 2 != 0)){
            return false;
        }
        if ((grid[i+1][j] % 2 != 1) || (grid[i][j+1] % 2 != 1) || (grid[i+2][j+1] % 2 != 1) || (grid[i+1][j+2] % 2 != 1)){
            return false;
        }
        if ((grid[i][j]+grid[i][j+1]+grid[i][j+2]==15) && (grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2]==15) && (grid[i][j]+grid[i+1][j]+grid[i+2][j]==15) && (grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2]==15) && (grid[i+1][j]+grid[i+1][j+2]==10) && (grid[i][j+1]+grid[i+2][j+1]==10) && (grid[i][j]+grid[i+2][j+2]==10) && (grid[i][j+2]+grid[i+2][j]==10)){
            return true;
        }
        return false;
    }
    
    
}