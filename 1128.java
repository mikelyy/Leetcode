class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int len = dominoes.length;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                int a = dominoes[i][0];
                int b = dominoes[i][1];
                int c = dominoes[j][0];
                int d = dominoes[j][1];
                if ((a==c && b==d) || (a==d && b==c)){
                    count+=1;
                }
            }
        }
        return count;
    }
}