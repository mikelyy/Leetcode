class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        List<String> res = new LinkedList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] check = new boolean[friends.length];
        check[id] = true;
        int temp = 0;
        queue.offer(id);
        while (!queue.isEmpty()){
            int n = queue.size();
            if (temp == level){
                break;
            }
            for (int i=0; i<n; i++){
                int index = queue.poll();
                int[] each_friends = friends[index];
                for (int each : each_friends){
                    if (check[each]==true){
                        continue;
                    }
                    queue.offer(each);
                    check[each] = true;
                }  
            }
            temp+=1;
        }
        while (!queue.isEmpty()){
            int ind = queue.poll();
            for (String each_watchedVideos : watchedVideos.get(ind)){
                map.put(each_watchedVideos, map.getOrDefault(each_watchedVideos,0)+1);
            }
        }
        res.addAll(map.keySet());
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare (String a, String b){
                int m = map.get(a);
                int n = map.get(b);
                if (m==n){
                    return a.compareTo(b);
                }
                return m-n;
            }
        });
        return res;
    }
}