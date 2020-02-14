class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        LinkedList<int[]> res = new LinkedList<int[]>();
        for (int[] interval: intervals){
            if (res.isEmpty() || interval[0]>res.getLast()[1]){
                res.add(interval);
            }
            else{
                res.getLast()[1]=Math.max(res.getLast()[1], interval[1]);
            }
        }
        int[][] result = new int[res.size()][];
        int i=0;
        for (int[] m : res){
            result[i++]=m;
        }
        return result;
    }
}