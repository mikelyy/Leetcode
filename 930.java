class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = new int[A.length+1];
        for (int i=0; i<A.length; i++){
            temp[i+1] = temp[i]+A[i];
        }
        for (int n : temp){
            res+=map.getOrDefault(n,0);
            map.put(n+S, map.getOrDefault(n+S, 0)+1);
        }
        return res;
    }
}