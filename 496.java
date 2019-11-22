class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> result = new Stack<>();
        HashMap<Integer, Integer> output = new HashMap<>();
        for (int n : nums2){
            while (!result.isEmpty() && result.peek()<n){
                output.put(result.pop(), n);
            }
            result.push(n);
        }
        for (int i=0; i<res.length; i++){
            res[i] = output.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}