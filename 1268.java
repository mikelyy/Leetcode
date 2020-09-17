class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<List<String>>();
        Arrays.sort(products);
        for (int i=0; i<searchWord.length(); i++){
            String sub = searchWord.substring(0, i+1);
            List<String> temp = new ArrayList<>();
            for (String pro : products){
                if (pro.startsWith(sub)){
                    if (temp.size()<3){
                        temp.add(pro);
                    }
                    else{
                        break;
                    }
                }
            }
            res.add(temp);
        }
        return res;
    }
}