/// String.valueOf(n).toCharArray(): transform integer to string, string to character
/// Integer.parseInt(String.valueOf(c)) / Character.getNumericValue(c): transform char to integer
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList();
        for (int i=left; i<=right; i++){
            if (check(i)){
                res.add(i);
            }
        }
        return res;
    }
    
    public boolean check(int i){
        for (char j: String.valueOf(i).toCharArray()){
            if (j=='0' || i % Integer.parseInt(String.valueOf(j)) >0){
                return false;
            }
        }
        return true;
    }
    
}