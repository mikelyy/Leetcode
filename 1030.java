class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int m = 0;
        for (int i=0; i<R; i++){
            for (int j=0; j<C; j++){
                res[m][0] = i;
                res[m][1] = j;
                m++;
            }
        }
        
        /// sort
        Arrays.sort(res, (a,b)-> Math.abs(a[0]-r0)+Math.abs(a[1]-c0)-Math.abs(b[0]-r0)-Math.abs(b[1]-c0));
        return res;
    }
}