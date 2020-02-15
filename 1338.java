class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, (a,b)->(b-a));
        int res = 0;
        int len = arr.length;
        int i=0;
        while (len>arr.length/2){
            res++;
            len-=list.get(i);
            i++;
        }
        return res;
    }
}