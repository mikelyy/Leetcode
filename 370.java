class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for (int[] n: updates){
            int start = n[0];
            int end = n[1];
            int add = n[2];
            for (int i=start; i<=end; i++){
                res[i] += add;
            }
        }
        return res;
    }
}