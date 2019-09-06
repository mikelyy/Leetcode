class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        int i=0;
        for (int a: A){
            if (a%2==0){
                ans[i]=a;
                i+=2;
            }
        }
        int j=1;
        for (int a: A){
            if (a%2!=0){
                ans[j]=a;
                j+=2;
            }
        }
        return ans;
    }
}