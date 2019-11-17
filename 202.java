class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> res = new HashSet<>();
        int helperresult = helper(n);
        while (helperresult!=1){
            if (res.contains(helperresult)){
                return false;
            }
            res.add(helperresult);
            helperresult=helper(helperresult);
        }
        return true;
    }
    
    public int helper(int n){
        int a = 0;
        int b = 0;
        while (n!=0){
            a = n % 10;
            b+=a*a;
            n=n/10;
        }
        return b;
    }
    
}