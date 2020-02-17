class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b)->a[1]==b[1] ? b[0]-a[0] : b[1]-a[1]);
        for (int[] n: restaurants){
            if ((veganFriendly==0 || n[2]==veganFriendly) && n[3]<=maxPrice && n[4]<=maxDistance){
                queue.offer(n);
            }
        }
        List<Integer> res = new LinkedList<>();
        while(queue.size()>0){
            res.add(queue.poll()[0]);
        }
        return res;
    }
}