/// getOrDefault if x is there, get the value of x, if not, return 0
/// throw null
class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> a = new HashMap<Integer, Integer>(); 
        for (int x : A){
            a.put(x, a.getOrDefault(x,0)+1);
        }

        for (int k : a.keySet()){
            if (a.get(k)>1){
                return k;
            }
        }
        throw null;
    }
}