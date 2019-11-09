class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> res = new HashMap();
        for (int i: candies){
            res.put(i, res.getOrDefault(i,0)+1);
        }
        return Math.min(res.size(),candies.length/2);
    }
}