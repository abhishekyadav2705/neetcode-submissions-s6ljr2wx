class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[]curr = q.poll();
            int r = curr[0];
            int c=curr[1];
            visit(grid,q,r+1,c,grid[r][c]);
            visit(grid,q,r-1,c,grid[r][c]);
            visit(grid,q,r,c+1,grid[r][c]);
            visit(grid,q,r,c-1,grid[r][c]);
        }
    }
    public void visit(int[][] grid, Queue<int[]>q,int r, int c, int dist){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=Integer.MAX_VALUE){
            return;
        }
        grid[r][c]=dist+1;
        q.offer(new int[]{r,c});
    }
}
