class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int res = 0;
        for (List<Integer>sub_wall:wall){
            int temp = 0;
            for (int j=0; j<sub_wall.size()-1; j++){
                temp += sub_wall.get(j);
                if (map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                }
                else{
                    map.put(temp,1);
                }
            }
        }
        for (int a : map.keySet()){
            res = Math.max(res,map.get(a));
        }
        return wall.size()-res;
    }
}