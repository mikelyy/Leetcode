class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String big = ">";
        String equal = "=";
        String small = "<";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<c1.length; i++){
            if (c1[i]<c2[i]){
                map.put(big,map.getOrDefault(big,0)+1);
            }
            else if (c1[i]>c2[i]){
                map.put(small,map.getOrDefault(small,0)+1);
            }
            else{
                map.put(equal,map.getOrDefault(equal,0)+1);
            }
        }
        map.remove(equal);
        return map.size() == 1;
    }
}