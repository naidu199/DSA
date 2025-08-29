// BFS

class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] visited=new int[n][m];

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=1 && grid[i][j]=='1'){
                    bfs(i,j,grid,visited,n,m);
                    count++;
                }
            }
        }

        return count;
    }


    public void bfs(int r,int c,char[][] grid,int[][] visited ,int n,int m){
        visited[r][c] = 1;
        Queue<Pair<Integer, Integer>> q=new LinkedList<>();
        q.add(new Pair<>(r,c));
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()){
            Pair<Integer, Integer> cell = q.poll();
            int row = cell.getKey();
            int col = cell.getValue();
            

            for (int k = 0; k < 4; k++) {
                int nrow = row + dr[k];
                int ncol = col + dc[k];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                    if (grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0) {
                        q.add(new Pair<>(nrow, ncol));
                        visited[nrow][ncol] = 1;
                    }
                }
            }
        }
        
    }
}


//DFS

class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] visited=new int[n][m];

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=1 && grid[i][j]=='1'){
                    dfs(i,j,grid,visited,n,m);
                    count++;
                }
            }
        }

        return count;
    }


    public void dfs(int r,int c,char[][] grid,int[][] visited ,int n,int m){

        if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] == '0' || 
        visited[r][c] == 1) {
            return;
        }
        visited[r][c] = 1;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        for(int i=0;i<4;i++){
            dfs(r+dr[i],c+dc[i],grid,visited,n,m);
        }
        
        
        
    }
}
