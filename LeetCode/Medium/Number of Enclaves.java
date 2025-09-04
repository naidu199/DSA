class Solution {
    public int numEnclaves(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        for(int i=0;i<m;i++){
            if(visited[0][i]==0 && grid[0][i]==1){
                dfs(0,i,visited,grid);
            }
        }
        for(int i=0;i<n;i++){
            if(visited[i][0]==0 && grid[i][0]==1){
                dfs(i,0,visited,grid);
            }
        }
        for(int i=0;i<m;i++){
            if(visited[n-1][i]==0 && grid[n-1][i]==1){
                dfs(n-1,i,visited,grid);
            }
        }

        for(int i=0;i<n;i++){
            if(visited[i][m-1]==0 && grid[i][m-1]==1){
                dfs(i,m-1,visited,grid);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;

    }

    public void dfs(int r,int c,int[][] visited,int[][] grid){
        visited[r][c]=1;
        int n=grid.length;
        int m= grid[0].length;
        int[] dRow={-1,0,1,0};
        int[] dCol={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=r+dRow[i];
            int ncol=c+dCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
            visited[nrow][ncol]==0 && grid[nrow][ncol]==1 ){
                dfs(nrow,ncol,visited,grid);
            }
        }
    }
}
