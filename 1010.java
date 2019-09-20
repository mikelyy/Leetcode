class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i=0; i<time.length; i++){
            for (int j=1; j<time.length; j++){
                int sum = time[i]+time[j];
                if (sum % 60 == 0){
                    count+=1;
                }
            }
        }
        count /= 2;
        return count;
    }
}