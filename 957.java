class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int recursive = 0;
        int temp = 0;
        int len = cells.length;
        if (N%14==0){
            recursive = 14;
        }
        else{
            recursive = N%14;
        }
        while (recursive>0){
            for (int i=0; i<len-1; i++){
                if (i==0){
                    temp = cells[i];
                    cells[i]=0;
                }
                else{
                    if (temp==cells[i+1]){
                        temp = cells[i];
                        cells[i]=1;
                    }
                    else{
                        temp = cells[i];
                        cells[i]=0;
                    }
                    if (i==len-2){
                        cells[len-1]=0;
                    }
                }
            }
            recursive--;
        }
        return cells;
    }
}