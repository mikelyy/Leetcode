class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        return invertImage(flipImage(A));
    }
    
    public int[][] flipImage(int[][] A){
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length/2; j++){
                int temp=A[i][j];
                A[i][j]=A[i][A[i].length-1-j];
                A[i][A[i].length-1-j]=temp;
            }
        }
        return A;
    }
    
    public int[][] invertImage(int[][] A){
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                if (A[i][j]==1){
                    A[i][j]=0;
                }
                else{
                    A[i][j]=1;
                }
            }
        }
        return A;
    }
}