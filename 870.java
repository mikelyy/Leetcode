/// treemap
class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer, Integer> treemap = new TreeMap<>();
        for (int n: A){
            treemap.put(n, treemap.getOrDefault(n, 0)+1);
        }
        int[] res = new int[A.length];
        for (int i=0; i<B.length; i++){
            Integer last = treemap.higherKey(B[i]);
            /// why return type is Integer???
            if (last==null){
                last=treemap.firstKey();
            }
            res[i]=last;
            int a = treemap.get(last);
            /// how many times it appears
            if (a>1){
                treemap.put(last, a-1);
            }
            else{
                treemap.remove(last);
            }
        }
        return res;
    }
}