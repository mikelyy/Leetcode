class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int j=2; j<n; j++){
            if (isprime(j)){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isprime(int number){
        int sqrt = (int) Math.sqrt(number)+1;
        for (int i=2; i<sqrt; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}