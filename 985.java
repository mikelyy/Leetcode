class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    
        int[] ans = new int[queries.length];
        
        for (int i=0; i<queries.length; i++){
            int val = queries[i][0];
            ///val=1 -3 -4 2
            int index = queries[i][1];
            /// index= 0 1 0 3
            A[index]+=val;
            int count=0;
            for (int j: A){
                if (j%2==0){
                    count+=j;
                }
            }
            ///count=2+2+4=8 first loop
            ///count=2+4=6 second loop
            ///count=-2+4=2 third loop
            ///count=-2+6=4 last loop
            ans[i]=count;
        }
        return ans;
    }
}