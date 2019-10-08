/// String reverse = new StringBuffer(i).reverse().toString();
/// String.trim() 
class Solution {
    public String reverseWords(String s) {
        String news[] = s.split(" ");
        StringBuilder res = new StringBuilder(); 
        for (String i: news){
            String reverse = new StringBuffer(i).reverse().toString();
            res.append(reverse+" ");
        }
        return res.toString().trim();
    }
}