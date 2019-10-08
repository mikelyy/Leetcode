class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List res = new ArrayList();
        if (matrix==null || matrix.length==0){
            return res;
        }
        
        int bottom = matrix.length-1;
        int top = 0;
        int right = matrix[0].length-1;
        int left = 0;
        
        while (top<=bottom && left<=right){
            for (int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            for (int j=top+1; j<=bottom; j++){
                res.add(matrix[j][right]);
            }
            for (int k=right-1; k>left; k--){
                res.add(matrix[bottom][k]);
            }
            for (int l=bottom; l>top; l--){
                res.add(matrix[l][left]);
            }
            top++;
            bottom--;
            left++;
            right--;
            
        }
        return res;
    }
}