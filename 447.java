class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> res;
        int output = 0;
        int distance = 0;
        for (int i=0; i<points.length; i++){
            res = new HashMap<>();
            for (int j=0; j<points.length; j++){
                if (j!=i){
                    distance = ((points[i][0]-points[j][0])*(points[i][0]-points[j][0]))
                        + ((points[i][1]-points[j][1])*(points[i][1]-points[j][1]));
                    res.put(distance, res.getOrDefault(distance, 0)+1);
                }
            }
            for (int m : res.values()){
                output += m*(m-1);
            }
        }
        return output;
    }
}