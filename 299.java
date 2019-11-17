class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> res = new HashMap();
        int bulls = 0;
        int cows = 0;
        for (int i=0; i<secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s==g){
                bulls++;
            }
            
            else{
                res.put(s, res.getOrDefault(s, 0)+1);
            }
        }
        
        for (int j=0; j<guess.length(); j++){
            char s = secret.charAt(j);
            char g = guess.charAt(j);
            if (s!=g){
                if (res.containsKey(g) && res.get(g)>0){
                    cows++;
                    res.put(g, res.get(g)-1);
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
}