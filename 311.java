class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        if (A.length==0 || B.length==0){
            return new int[0][0];
        }
        int a = A.length;
        int b = A[0].length;
        int c = B.length;
        int d = B[0].length;
        int[][] res = new int[a][d];
        
        List<int[]> temp = new ArrayList<>();
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (A[i][j]!=0){
                    temp.add(new int[]{i,j});
                }
            }
        }
        
        for (int[] n: temp){
            for (int k=0; k<d; k++){
                if (B[n[1]][k]!=0){
                    res[n[0]][k] += B[n[1]][k] * A[n[0]][n[1]];
                }
            }
        }
        return res;
    }
}