class Solution {
    public int numDecodings(String s) {
        ///dp
        if (s==null || s.length()==0){
            return 0;
        }
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i=2; i<=s.length(); i++){
            Character a = s.charAt(i-1);
            if (a!='0'){
                dp[i] += dp[i-1];
            }
            Character b = s.charAt(i-2);
            if (b=='1' || (b=='2' && a<='6')){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
}