class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> res = new ArrayList<>();
        String[] text_updated = text.split(" ");
        /// text_updated = alice, is, a, good, girl, she, is, a, good, student
        for (int i=0; i<text_updated.length-2; i++){
            if (text_updated[i].equals(first) && text_updated[i+1].equals(second)){
                res.add(text_updated[i+2]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}