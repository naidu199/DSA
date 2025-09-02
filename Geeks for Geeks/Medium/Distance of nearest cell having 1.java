class Solution {
    // Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<int[]> q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    grid[i][j] = 0;
                    q.offer(new int[]{i,j});
                }else{
                    grid[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int row=arr[0];
            int col=arr[1];
            
            int[] dRow={-1,0,1,0};
            int[] dCol={0,1,0,-1};
            
            for(int i=0;i<4;i++){
                int nrow=row+dRow[i];
                int ncol=col+dCol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                grid[nrow][ncol]>grid[row][col]+1 ){
                    grid[nrow][ncol]=grid[row][col]+1;
                    q.offer(new int[]{nrow,ncol});
                }
            }
        }
        
        return grid;
        
    }
}
