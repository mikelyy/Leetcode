class Solution {
    public String alphabetBoardPath(String target) {
        int row = 0;
        int col = 0;
        StringBuilder res = new StringBuilder("");
        for (char c : target.toCharArray()){
            int i = (int) c;
            int row_cur = (i-97)/5;
            int col_cur = (i-97)%5;
            if (row == row_cur && col == col_cur){
                res.append("!");
            }
            else{
                if (row < row_cur){
                    if (row_cur == 5){
                        while(col != col_cur){
                            res.append("L");
                            col--;
                        }
                         while(row != row_cur){
                            res.append("D");
                            row++;
                        }
                    }
                    while(row != row_cur){
                        res.append("D");
                        row++;
                    }
                }
                else{
                    while(row != row_cur){
                        res.append("U");
                        row--;
                    }
                }
                if (col < col_cur){
                    while(col != col_cur){
                        res.append("R");
                        col++;
                    }
                }
                else{
                    while(col != col_cur){
                        res.append("L");
                        col--;
                    }
                }
                res.append("!");
            }
        }
        return res.toString();
    }
}