class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int i=0; i<bookings.length; i++){
            int[] booking = bookings[i];
            int start = booking[0]-1;
            int end = booking[1]-1;
            int value = booking[2];
            for (int k=start; k<=end; k++){
                res[k] += value;
            }
        }
        return res;
    }
}