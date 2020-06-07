class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<board.length; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j=0; j<board[i].length; j++){
                if (board[i][j]=='.'){
                    continue;
                }
                if (set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        
        for (int i=0; i<board[0].length; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j=0; j<board.length; j++){
                if (board[j][i]=='.'){
                    continue;
                }
                if (set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                HashSet<Character> set = new HashSet<>();
                for (int a=i*3; a<i*3+3; a++){
                    for (int b=j*3; b<j*3+3; b++){
                        if (board[a][b]=='.'){
                            continue;
                        }
                        if (set.contains(board[a][b])){
                            return false;
                        }
                        set.add(board[a][b]);
                    }
                }
            }
        }
        return true;
    }
}