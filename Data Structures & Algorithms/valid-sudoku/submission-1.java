class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int row = 0; row<9;row++){
            for(int col = 0; col<9;col++){
                
                char ch = board[row][col];

                if(ch=='.'){
                    continue;
                }

                int digit = ch-'1';
                int boxIndex = (row/3)*3+(col/3);

                if(rows[row][digit]|| cols[col][digit] || boxes[boxIndex][digit]){
                    return false;
                }

                rows[row][digit]=true;
                cols[col][digit]=true;
                boxes[boxIndex][digit]=true;

            }
        }
        return true;
    }
}
