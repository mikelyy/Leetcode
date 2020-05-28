class Solution {
    public int minAreaRect(int[][] points) {
        HashSet<String> set = new HashSet<>();
        // easy for later comparision
        for (int[] point : points){
            set.add(point[0]+","+point[1]);
        }
        int res = Integer.MAX_VALUE;
        for(int[] left:points){
            for (int[] right:points){
                // any pair of two points where Xs are not same and Ys are not same
                if (left[0]>right[0] && left[1]>right[1]){
                    // great way from discuss for set to contain both vertices at same time
                    // two other vertices
                    String first = left[0]+","+right[1];
                    String second = right[0]+","+left[1];
                    if (set.contains(first)&&set.contains(second)){
                        int area = helper(left,right);
                        res = Math.min(res,area);
                    }
                }
            }
        }
        // case for no rectangular found
        if (res==Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
    
    // helper for calculating area
    private int helper(int[] left, int[] right){
        int a = left[0]-right[0];
        int b = left[1]-right[1];
        return a*b;
    }
}