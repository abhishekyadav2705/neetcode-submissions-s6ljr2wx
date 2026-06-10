class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int row=0;row<9;row++){
            for(int cols=0;cols<9;cols++){
                char num = board[row][cols];
                if(num=='.'){
                    continue;
                }
                String rowKey = num +"in row"+row;
                String colKey = num +"in col"+cols;
                String boxKey = num +"in box"+(row/3)+"-"+(cols/3);

                if(!set.add(rowKey)
                ||!set.add(colKey) 
                || !set.add(boxKey)){
                    return false;
                }
            }
        }
        return true;
    }
}
