class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i=0; i<words.length; i++){
            if (i<words.length-1){
                String prev = words[i];
                String curr = words[i+1];
                /// prev = hello
                /// curr = leetcode
                int index = 0;
                while (index<prev.length() && index<curr.length()){
                    int prev_index = order.indexOf(prev.charAt(index));
                    int curr_index = order.indexOf(curr.charAt(index));
                    if (prev_index > curr_index){
                        return false;
                    }
                    else if (prev_index == curr_index){
                        index++;
                    }
                    else{
                        break;
                    }
                }
                if (index<prev.length() && index==curr.length()){
                    return false;
                }
            }
        }
        return true;
    }
}