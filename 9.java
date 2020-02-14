class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        int res = 0;
        int original = x;
        while (x!=0){
            res=x%10+10*res;
            x/=10;
        }
        return original==res;
    }
}