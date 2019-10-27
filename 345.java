class Solution {
    public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (!checkvowel(res[i])){
                i++;
            }
            else if (!checkvowel(res[j])){
                j--;
            }
            else{
                char temp=res[i];
                res[i]=res[j];
                res[j]=temp;
                i++;
                j--;
            }
        }
        return String.valueOf(res);
    }
    
    public boolean checkvowel(char c){
        char all = Character.toLowerCase(c);
        if ((all=='a') || (all=='e') || (all=='i') || (all=='o') || (all=='u')){
            return true;
        }
        return false;
    }
    
}