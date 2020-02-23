/// sliding window
class Solution {
    public int maxTurbulenceSize(int[] A) {
        int[] increase = new int[A.length];
        int[] decrease = new int[A.length];
        int res = 1;
        increase[0]=1;
        decrease[0]=1;
        for (int i=1; i<A.length; i++){
            if (A[i]<A[i-1]){
                decrease[i]=1+increase[i-1];
                increase[i]=1;
                res=Math.max(decrease[i], res);
            }
            else if (A[i]>A[i-1]){
                increase[i]=1+decrease[i-1];
                decrease[i]=1;
                res=Math.max(increase[i], res);
            }
            else{
                /// reset both increase and decrease to 1
                increase[i]=1;
                decrease[i]=1;
            }
        }
        return res;
    }
}