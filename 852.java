class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int a=0;
        int b=A.length-1;
        while (a<=b){
            int mid = a+(b-a)/2;
            if (A[mid]<A[mid+1]){
                a=mid+1;
            }
            else{
                b=mid-1;
            }
        }
        return a;
    }
}
