class Solution {
    public boolean judgeCircle(String moves) {
        int countx=0;
        int county=0;
        for (char i: moves.toCharArray()){
            if (i=='U'){
                countx+=1;
            }
            else if (i=='D'){
                countx-=1;
            }
            else if (i=='L'){
                county-=1;
            }
            else{
                county+=1;
            } 
        }
        if (countx==0 && county==0)
        {
            return true;
        }
        return false;
    }
}