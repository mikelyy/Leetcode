/// sliding window

class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int prev = A[0];
        int max = Integer.MIN_VALUE;
        for (int i=1; i<A.length; i++){
            /// compare whether add a new interger is beneficial or not
            max = Math.max(max, prev+A[i]-i);
            /// check whether restart at a new index or not
            prev = Math.max(prev, A[i]+i);
        }
        return max;
    }
}