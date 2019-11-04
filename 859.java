class Solution {
    public boolean buddyStrings(String A, String B) {
        /// length not equal case
        if (A.length()!=B.length()){
            return false;
        }
        /// A=B case
        if (A.equals(B)){
            Set check = new HashSet();
            for (int i=0; i<A.length(); i++){
                if (check.contains(A.charAt(i))){
                    return true;
                }
                else{
                    check.add(A.charAt(i));
                }
            }
            return false;
        }
        /// A!=B case
        int count = 0;
        int m=0;
        int n=0;
        for (int j=0; j<A.length(); j++){
            m+=A.charAt(j);
            n+=B.charAt(j);
            if (A.charAt(j)!=B.charAt(j)){
                count++;
            }
            if (count>2){
                return false;
            }
        }
        return count<=2 && m==n;
    }
}