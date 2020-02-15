 class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i=0; i<words.length; i++){
            if (words[i].equals(word1)){
                set1.add(i);
            }
            if (words[i].equals(word2)){
                set2.add(i);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int j: set1){
            for (int k: set2){
                if (j!=k){
                    res = Math.min(res, Math.abs(j-k));
                }
            }
        }
        return res;
    }
}