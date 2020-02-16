/// longest common subsequence
class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] matrix = new int[A.length+1][B.length+1];
        for(int i=0; i<A.length+1; i++){
            for(int j=0; j<B.length+1; j++){
                if (i==0 || j==0){
                    matrix[i][j]=0;
                }
                else if (A[i-1] == B[j-1]){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }
                else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
                
            }   
        }
        return matrix[A.length][B.length];
    }
}