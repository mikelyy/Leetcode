class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] res = new int[2];
        /// sum of values in A
        /// sum of values in B
        nt a=0;
        int b=0;
        for (int i: A){
            a+=i;
        }
        for (int l: B){
            b+=l;
        }

        int mid = (a-b)/2;
        for (int j=0; j<A.length; j++){
            for (int k=0; k<B.length; k++){
                if (A[j]-B[k]==mid){
                    res[0]=A[j];
                    res[1]=B[k];
                }
            }
        }
        return res;
    }
}