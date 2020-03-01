class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        return helper(A, R)-helper(A, L-1);
    }
    public int helper(int[] A, int m){
        int res = 0;
        int temp = 0;
        for (int n: A){
            if (n>m){
                temp=0;
            }
            else{
                temp+=1;
            }
            res+=temp;
        }
        return res;
    }
}