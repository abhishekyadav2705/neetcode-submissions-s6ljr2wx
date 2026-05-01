class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n =  heights[0].length;

        boolean[][] atlantic = new boolean[m][n];
        boolean[][] pacific = new boolean[m][n];

        //pacific(top+left)
        for(int i=0;i<m;i++){
            dfs(heights,pacific,i,0);
            dfs(heights,atlantic,i,n-1);
        }

        for(int j=0;j<n;j++){
            dfs(heights,pacific,0,j);
            dfs(heights,atlantic,m-1,j);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int i,int j){
        visited[i][j]=true;

        // DOWN
        if (i + 1 < heights.length &&
            !visited[i + 1][j] &&
            heights[i + 1][j] >= heights[i][j]) {

            dfs(heights, visited, i + 1, j);
        }

         // UP
        if (i - 1 >= 0 &&
            !visited[i - 1][j] &&
            heights[i - 1][j] >= heights[i][j]) {

            dfs(heights, visited, i - 1, j);
        }

        // RIGHT
        if (j + 1 < heights[0].length &&
            !visited[i][j + 1] &&
            heights[i][j + 1] >= heights[i][j]) {

            dfs(heights, visited, i, j + 1);
        }

        // LEFT
        if (j - 1 >= 0 &&
            !visited[i][j - 1] &&
            heights[i][j - 1] >= heights[i][j]) {

            dfs(heights, visited, i, j - 1);
        }
        
    }
}
