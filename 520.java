class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i)<='Z'){
                count+=1;
            }
        }
        if (count==0){
            return true;
        }
        else if (count==word.length()){
            return true;
        }
        else if (count==1 && word.charAt(0)<='Z'){
            return true;
        }
        return false;
    }
}