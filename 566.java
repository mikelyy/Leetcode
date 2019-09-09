class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        /// case where original matrix is returned
        if (nums.length == 0 || r*c!=nums[0].length*nums.length){
            return nums;
        }
        int row=0;
        int col=0;
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                /// add up to the first row finished
                res[row][col] = nums[i][j];
                col++;
                /// jump to the second row if needed and restart at col=0 position
                if (col==c){
                    row++;
                    col=0;
                }
            }
        }
        return res;
    }
}