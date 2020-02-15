class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        ///Arrays.sort(arr);
        int sum = 0;
        int i;
        for (i=0; i<k; i++){
            sum += arr[i];
        }
        int avg = 0;
        avg = sum / k;
        int count = 0;
        if (avg>=threshold){
            count++;
        }
        int j=0;
        while (i<arr.length){
            sum+=arr[i];
            sum-=arr[j];
            avg = sum / k;
            if (avg>=threshold){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}