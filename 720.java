class Solution {
    public String longestWord(String[] words) {
        String res = "";
        HashSet<String> set = new HashSet();
        for (String word: words){
            set.add(word);
        }
        for (String word: words){
            if (word.length()>res.length() || word.length()==res.length() && word.compareTo(res)<0){
                boolean check = true;
                for (int k=1; k<word.length(); k++){
                    if (!set.contains(word.substring(0,k))){
                        check=false;
                        break;
                    }
                }
                if (check){
                    res = word;
                }
            }
        }
        return res;
    }
}