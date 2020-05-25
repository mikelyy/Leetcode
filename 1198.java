class Solution {
    public int smallestCommonElement(int[][] mat) {
        int m = mat[0].length;
        int n = mat.length;
        int[] res = new int[10001];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (++res[mat[i][j]] == n){
                    return mat[i][j];
                }
            }
        }
        return -1;
    }
}