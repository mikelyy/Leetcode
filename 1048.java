class Solution {
    public int longestStrChain(String[] words) {
        int max = 1;
        Map<String, Integer> map = new HashMap<>();
        List<String>[] wordlist = new List[17];
        // put each word in words into the list
        for (String word: words){
            int len = word.length();
            if (wordlist[len]==null){
                wordlist[len]=new ArrayList<>();
            }
            wordlist[len].add(word);
            map.put(word,1);
        }
        // loop over the list
        for (int len=1; len<17; len++){
            if (wordlist[len]==null){
                continue;
            }
            // set up preword and compare
            for (String word: wordlist[len]){
                int prelen = len-1;
                if (wordlist[prelen]==null){
                    break;
                }
                for (String preword: wordlist[prelen]){
                    if (ispre(preword, word)){
                        // Math.max is to determine use this one or the previous one gives better output
                        map.put(word, Math.max(map.get(word),map.get(preword)+1));
                        // update the max value (only if choose using this current word)
                        max = Math.max(max, map.get(word));
                    }
                }
            }
        }
        return max;
    }
    
    // helper function to determine whether string a is predecessor of string b
    private boolean ispre(String a, String b){
        boolean found = false;
        int m=0;
        int n=0;
        while(m<a.length() && n<b.length()){
            if (a.charAt(m)==b.charAt(n)){
                m++;
                n++;
            }
            else if (found){
                return false;
            }
            else{
                found=true;
                n++;
            }
        }
        return true;
    }
}