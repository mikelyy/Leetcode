class Solution {
    public int partitionDisjoint(int[] A) {
        int pivot = 0;
        int cur = A[0];
        int cur_max = A[0];
        for (int i=1; i<A.length; i++){
            if (A[i]<cur){
                pivot=i;
                cur=cur_max;
            }
            cur_max = Math.max(cur_max, A[i]);
        }
        return pivot+1;
    }
}