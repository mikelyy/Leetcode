class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        // priorityqueue 大小排序
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for (Integer m : map.keySet()){
            // 存入hashmap的格式
            queue.offer(new int[]{map.get(m), m});
            if (queue.size()>k){
                queue.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<k; i++){
            res.add(queue.poll()[1]);
        }
        // int[] array = list.stream().mapToInt(i->i).toArray();
        // list of integer to int[]
        int[] result = res.stream().mapToInt(i->i).toArray();
        return result;
    }
}