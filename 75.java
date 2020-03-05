class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums){
            if (!map.containsKey(n)){
                map.put(n, 0);
            }
            map.put(n, map.get(n)+1);
        }
        int red=0;
        int white=0;
        int blue=0;
        if (map.containsKey(0)){
            red = map.get(0);
            for (int i=0; i<red; i++){
                nums[i]=0;
            }
        }
        if (map.containsKey(1)){
            white = map.get(1);
            for (int j=red; j<red+white; j++){
                nums[j]=1;
            }
        }
        if (map.containsKey(2)){
            blue = map.get(2);
            for (int k=red+white; k<red+white+blue; k++){
                nums[k]=2;
            }
        }
    }
}