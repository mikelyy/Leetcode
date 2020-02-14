class Solution {
    public int numIslands(char[][] grid) {
        if (grid==null || grid.length==0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j] == '1'){
                    res+=1;
                    helper(grid, i, j);
                }
            }
        }
        return res;
    }
    
    public void helper(char[][] grid, int r, int c){
        while (r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c] == '1'){
            grid[r][c] = '0';
            helper(grid, r+1, c);
            helper(grid, r-1, c);
            helper(grid, r, c+1);
            helper(grid, r, c-1);
        }
    }
}