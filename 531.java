class Solution {
    public int findLonelyPixel(char[][] picture) {
        int a = picture.length;
        int b = picture[0].length;
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (picture[i][j] == 'B'){
                    row.put(i, row.getOrDefault(i,0)+1);
                    col.put(j, col.getOrDefault(j,0)+1);
                }
            }
        }
        int res=0;
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (picture[i][j]=='B'){
                    if (row.get(i)==1 && col.get(j)==1){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}