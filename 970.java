class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> res = new HashSet();
        int result = 0;
    
        for (int i=0; i<20 && Math.pow(x, i)<=bound; i++){
            for (int j=0; j<20 && Math.pow(y, j)<=bound; j++){
                /// 2^10 = 1024 => 2^20 >1000000 (10^6) choose 20 as power boundary
                result = (int) Math.pow(x, i)+(int) Math.pow(y, j);
                /// Math.pow gives double type instead of integer type
                if (result<=bound){
                    res.add(result);
                }
            }
        }
        return new ArrayList(res);
    }
}