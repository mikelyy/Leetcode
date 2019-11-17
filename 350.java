///import com.google.common.collect.HashMultiset; 
///import com.google.common.collect.Multiset; 
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> res1 = new HashMap<>();
        ///Multiset<String> res1 = HashMultiset.create();
        List<Integer> output = new ArrayList<Integer>();
        for (int i=0; i<nums1.length; i++){
            res1.put(nums1[i], res1.getOrDefault(nums1[i],0)+1);
        }
        /// res1 = 4,1 9,1 5,1
        /// res1 = 1,2 2,2
        for (int j=0; j<nums2.length; j++){
            if (res1.containsKey(nums2[j])){
                output.add(nums2[j]);
                /// output = 9 4
                /// output = 2 2
                if (res1.get(nums2[j])==1){
                    res1.remove(nums2[j]);
                }
                else{
                    res1.put(nums2[j], res1.get(nums2[j])-1);
                }
            }
        }
        return output.stream().mapToInt(i->i).toArray();
        ///return output.stream().mapToInt(Integer::intValue).toArray();
        /// list<integer> -> int[]
    }
}