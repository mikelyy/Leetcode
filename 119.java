class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex<0){
           return res; 
        }
        res.add(1);
        int nominator = rowIndex;
        int denominator = 1;
        long result = 1;
        for (int i=1; i<=rowIndex; i++){
            result *= nominator;
            result /= denominator;
            nominator--;
            denominator++;
            res.add((int) result);
        }
        return res;
    }
}