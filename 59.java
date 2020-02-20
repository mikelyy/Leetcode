class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n==0){
            return matrix;
        }
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int start=1;
        while (left<=right && top<=bottom){
            for (int i=left; i<=right; i++){
                matrix[top][i] = start++;
            }
            for (int j=top+1; j<=bottom; j++){
                matrix[j][right] = start++;
            }
            if (left<right && top<bottom){
                for (int k=right-1; k>left; k--){
                    matrix[bottom][k] = start++;
                }
                for (int l=bottom; l>top; l--){
                    matrix[l][left] = start++;
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return matrix;
    }
}