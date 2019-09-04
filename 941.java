class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length<3){
            return false;
        }
        int i=0;
        int j=A.length-1;
        while (i<A.length-1 && A[i]<A[i+1]){
            i++;
        }
        while (A[j]<A[j-1] && j>0){
            j--;
        }
        if (i==j){
            return true;
        }
        return false;
    }
}