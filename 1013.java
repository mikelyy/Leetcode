class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        /// sum of all values in A & target is the target value
        int total = 0;
        for (int x: A){
            total+=x;
        }
        int target = total/3;
        
        int sum = 0;
        for (int i=0; i<A.length; i++){
            sum += A[i];
            if (sum == target){
                sum=0;
            }
        }
        if (sum==0){
            return true;
        }
        else{
            return false;
        }
    }
}