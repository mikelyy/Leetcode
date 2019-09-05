class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int m=0;
        
        for (int i=0; i<A.length; i++){
            if (A[i]%2==0){
                ans[m]=A[i];
                m++;
            }
        }n
        for (int j=0; j<A.length; j++){
            if (A[j]%2==1){
                ans[m]=A[j];
                m++;
            }
        }
        return ans;
    }
}