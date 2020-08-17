class Solution {
    public int minFlips(String target) {
        String res = "0" + target;
        int result = 0;
        for (int i=1; i<res.length(); i++){
            if (res.charAt(i) != res.charAt(i-1)){
                result+=1;
            }
        }
        return result;
    }
}