/// creat a list of boolean value
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
    List<Boolean> list = new ArrayList<Boolean>();
        int count = 0;
        for (int i=0; i<A.length; i++){
            count = count*2+A[i];
            if (count % 5 == 0){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}