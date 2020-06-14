class Solution {
    public boolean canReorderDoubled(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : A){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        // create B and sort based on absolute value
        Integer[] B = new Integer[A.length];
        for (int i=0; i<A.length; i++){
            B[i]=A[i];
        }
        Arrays.sort(B, (a,b)->(Integer.compare(Math.abs(a), Math.abs(b))));
        for (int n : B){
            if (map.get(n)==0){
                continue;
            }
            if (map.getOrDefault(2*n, 0)<=0){
                return false;
            }
            map.put(n, map.get(n)-1);
            map.put(2*n, map.get(2*n)-1);
        }
        return true;
    }
}