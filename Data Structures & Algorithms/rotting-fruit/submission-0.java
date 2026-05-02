class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh=0;

        //step 1: collect all rotten and fresh count
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time =0;
        //BFS
        while(!q.isEmpty() && fresh>0){
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] cell = q.poll();
                int r = cell[0], c=cell[1];
                    // DOWN
                if (r + 1 < m && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    q.add(new int[]{r + 1, c});
                    fresh--;
                }

                // UP
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    q.add(new int[]{r - 1, c});
                    fresh--;
                }

                // RIGHT
                if (c + 1 < n && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    q.add(new int[]{r, c + 1});
                    fresh--;
                }

                // LEFT
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    q.add(new int[]{r, c - 1});
                    fresh--;
                }
            }
            time++;
        }
        return fresh ==0 ? time : -1;
    }
}
