class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        // use hastset to decrease time limit
        HashSet<String> set = new HashSet();
        for (String dict_each : dict){
            set.add(dict_each);
        }
        StringBuilder res = new StringBuilder();
        // str.split("\\s+");
        for (String each : sentence.split("\\s+")){
            String first = "";
            for (int i=1; i<=each.length(); i++){
                first = each.substring(0,i);
                if (set.contains(first)){
                    break;
                }
            }
            if (res.length()>0){
                res.append(" ");
            }
            res.append(first);
        }
        return res.toString();
    }
}