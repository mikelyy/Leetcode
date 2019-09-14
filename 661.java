/// review
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int a=M.length;
        int b=M[0].length;
        int[][] res = new int [a][b];
        /// loop through the original matrix
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                int count=0;
                /// loop through each element surrounding 8 element is any
                /// error: m<=i+1 and n<=j+1 because we include them
                for (int m=i-1; m<=i+1; m++){
                    for (int n=j-1; n<=j+1; n++){
                        /// count is the number of available elements surrounding
                        /// check the boundary
                        /// error: m<a and j<b because we cannot go over the horizontal and vertical length of the original matrix
                        if (m>=0 && n>=0 && m<a && n<b){
                            res[i][j]+=M[m][n];
                            count++;
                        }
                    }
                }
                res[i][j] /= count; 
            }
        }
        return res;
    }
}