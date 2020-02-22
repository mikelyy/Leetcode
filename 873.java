class Solution {
    public int lenLongestFibSubseq(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for(int n: A){
            set.add(n);
        }
        for(int i=0; i<A.length; i++){
            for (int j=i+1; j<A.length; j++){
                int a = A[j];
                int b = A[i]+A[j];
                int count = 2;
                while (set.contains(b)){
                    int temp = b;
                    b+=a;
                    a=temp;
                    res = Math.max(res, 1+count++);
                }
            }
        }
        if (res>=3){
            return res;
        }
        else{
            return 0;
        }
    }
}