/// increasing 和 decreasing function 注意 check的是只要出现一次违反的就false 而不是有一个遵循的就true 需要每个都是遵循
class Solution {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }
    
    public boolean increasing(int[] A){
        for (int i=0; i<A.length-1; i++){
            if (A[i]>A[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public boolean decreasing(int[] A){
        for (int i=0; i<A.length-1; i++){
            if (A[i]<A[i+1]){
                return false;
            }
        }
        return true;
    }
    
}