
class Solution {
    public int countIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] visited=new int[n][m];

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=1 && grid[i][j]=='L'){
                    dfs(i,j,grid,visited,n,m);
                    count++;
                }
            }
        }

        return count;
    }


    public void dfs(int r,int c,char[][] grid,int[][] visited ,int n,int m){

        if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] == 'W' || 
        visited[r][c] == 1) {
            return;
        }
        visited[r][c] = 1;
        for(int dr=-1;dr<=1;dr++){
            for(int dc=-1;dc<=1;dc++){
                dfs(r+dr,c+dc,grid,visited,n,m);
            }
        }
        
        
        
    }
}
