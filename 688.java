class Solution {
    public double knightProbability(int N, int K, int r, int c) {
        /// dp 
        double[][] dp_old = new double[N][N];
        dp_old[r][c] = 1;
        int[] horizontal = new int[] {1,-1,1,-1,2,-2,2,-2};
        int[] vertical = new int[] {2,-2,-2,2,1,-1,-1,1};
        for (int step=0; step<K; step++){
            double[][] dp_new = new double[N][N];
            for (int i=0; i<N; i++){
                for (int j=0; j<N; j++){
                    for (int k=0; k<8; k++){
                        int r_new = i+horizontal[k];
                        int c_new = j+vertical[k];
                        if (r_new>=0 && r_new<N && c_new>=0 && c_new<N){
                            dp_new[r_new][c_new] += dp_old[i][j];
                        }
                    }
                }
            }
            dp_old = dp_new;
        }
        double res = 0;
        for (int x=0; x<N; x++){
            for (int y=0; y<N; y++){
                res += dp_old[x][y];
            }
        }
        return res / Math.pow(8,K);
    }
}