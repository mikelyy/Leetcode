class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> res = new PriorityQueue<Integer>((a,b)->a-b);
        for (int n: nums){
            res.add(n); 
            if (res.size()>k){
                res.poll();
            }
        }
        return res.poll();
    }
}