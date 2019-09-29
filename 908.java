class Solution {
    public int smallestRangeI(int[] A, int K) {
        int a = A[0];
        int b = A[0];
        for (int x: A){
            a = Math.max(x, a);
            b = Math.min(x, b);
            
        }
        return Math.max(0,a-b-2*K);
    }
}