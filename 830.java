/// review
/// error (out of boundary): first check higher boundary of i and then check consecutive elements same or not
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        int j = 0;
        /// output should be in the form of a list of list of integers
        /// arraylist size can be modified
        List<List<Integer>> res= new ArrayList();
        for (int i=0; i<S.length(); i++){
            if (i==S.length()-1 || S.charAt(i)!=S.charAt(i+1)){
               if (i-j+1>=3){
                   /// Arrays.asList transform array to list form
                   /// Arrays.asList(new Integer[]{j,i})
                   res.add(Arrays.asList(new Integer[]{j,i}));
               }
               j=i+1;
            }
        }
        return res;
    }
}