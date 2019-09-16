/// review
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;
        /// if 0, it is one digit, so add one
        /// if 1, it is two digits, so add two
        /// loop until the second last element
        while (i<n-1){
            if (bits[i]==0){
                i++;
            }
            else{
                i+=2;
            }
        }
        /// after the loop, if encounter the last element, we return true
        if (i == n-1){
            return true;
        }
        return false;
    }
}