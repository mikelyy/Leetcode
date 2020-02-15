/// sliding window
/// number of 1 -> index 0 to res-1 -> update by shifiting rightward by 1 each time -> 
/// compare to find the max -> min of swaps is the number of 1 - max(每个number of 1中的已经有的1的个数)
class Solution {
    public int minSwaps(int[] data) {
        int res = 0;
        for (int n: data){
            res += n;
        }
        int left = 0, right = 0, count = 0, max = 0;
        while (right<data.length){
            if (right-left<res){
                count += data[right++];
            }
            else{
                max = Math.max(count, max);
                count -= data[left++];
                count += data[right++];
            }
        }
        return res-max;
    }
}