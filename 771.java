class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashSet<Character> result = new HashSet<>();
        for (Character c : J.toCharArray()){
            result.add(c);
        }
        for (Character c : S.toCharArray()){
            if (result.contains(c)){
                count+=1;
            }
        }
        return count;
    }
}