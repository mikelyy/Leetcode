class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int n=1;
        while (n * (1+n)<=2*candies){
            n++;
        }
        
        int rest = candies;
        for (int i=1; i<n; i++){
            res[(i-1) % num_people] += i;
            rest -= i;
        }
        res[(n-1) % num_people] += rest;
        return res;
    }
}