class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer a : nums1){
            set1.add(a);
        }
        /// set1 = 4 9 5
        for (Integer b : nums2){
            set2.add(b);
        }
        /// set2 = 9 4 8
        
        int[] res = new int[Math.min(set1.size(), set2.size())];
        int index = 0;
        for (Integer c : set1){
            if (set2.contains(c)){
                res[index++]=c;
            }            
        }
        return Arrays.copyOf(res, index);
        /// Arrays.copyOf() copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.
        
    }
}