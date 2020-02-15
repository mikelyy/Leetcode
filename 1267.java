class Solution {
    public int countServers(int[][] grid) {
        if (grid.length==0 || grid==null){
            return 0;
        }
        int a = grid.length;
        int b = grid[0].length;
        int res = 0;
        int[] r = new int[a];
        int[] c = new int[b];
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (grid[i][j]==1){
                    r[i]++;
                    c[j]++;
                }
            }
        }
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (grid[i][j]==1 && (r[i]>1 || c[j]>1)){
                    res++;
                }
            }
        }
        return res;
    }
}