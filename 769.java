class Solution {
    public int maxChunksToSorted(int[] arr) {
        int res = 0;
        for (int i=0; i<arr.length; i++){
            int a = arr[i];
            while (a>i){
                i++;
                a = Math.max(arr[i], a);
            }
            res++;
        }
        return res;
    }
}