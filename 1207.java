class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> a = new HashMap<Integer, Integer>(); 
        Set<Integer> b = new HashSet<Integer>(); 
        for (int i=0; i<arr.length; i++){
            if (!a.containsKey(arr[i])){
                a.put(arr[i],1);
            }
            else{
                a.put(arr[i], a.get(arr[i])+1);
            }
        }
        
        /// a = 1,3次  2,2次  3,1次
        for (int k : a.keySet()){
            if (!b.add(a.get(k))){
                return false;
            }
        }
        return true;
    }
}