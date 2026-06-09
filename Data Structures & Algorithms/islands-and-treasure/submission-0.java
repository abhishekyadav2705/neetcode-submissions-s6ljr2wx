class Solution {
    public void islandsAndTreasure(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        while(!q.isEmpty()) {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            visit(rooms, q, r + 1, c, rooms[r][c]);
            visit(rooms, q, r - 1, c, rooms[r][c]);
            visit(rooms, q, r, c + 1, rooms[r][c]);
            visit(rooms, q, r, c - 1, rooms[r][c]);
        }
    }

    private void visit(int[][] rooms, Queue<int[]> q,
                      int r, int c, int dist) {

        if(r < 0 || c < 0 ||
           r >= rooms.length ||
           c >= rooms[0].length ||
           rooms[r][c] != Integer.MAX_VALUE) {
            return;
        }

        rooms[r][c] = dist + 1;
        q.offer(new int[]{r, c});
    }
}
