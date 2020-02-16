/// index 0 to n-k-1
/// index n-k to n-1
class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int start = 0;
        for (int i=1; i<n-k; i++){
            res[start++] = i;
        }
        for (int j=0; j<=k; j++){
            if (j % 2 == 0){
                res[start++] = n-k+j/2;
            }
            else{
                res[start++] = n-j/2;
            }
        }
        return res;
    }
}
