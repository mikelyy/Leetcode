class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> res = new HashMap<String, Integer>();
        for (int i=0; i<list1.length; i++){
            res.put(list1[i],i);
        }
        int count = 0;
        int boundary = Integer.MAX_VALUE;
        /// Integer.MAX_VALUE gives the maximum value in java
        List<String> output = new ArrayList<>();
        for (int j=0; j<list2.length; j++){
            if (res.containsKey(list2[j])){
                count = j + res.get(list2[j]);
                if (count<boundary){
                    output.clear();
                    output.add(list2[j]);
                    boundary = count;
                }
                else if (count==boundary){
                    output.add(list2[j]);
                }
            }
        }
        return output.toArray(new String[output.size()]);
    }
}