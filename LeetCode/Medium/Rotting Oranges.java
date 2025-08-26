class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair3> queue=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];

        int countF=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2 && visited[i][j]!=1){
                    queue.offer(new Pair3(i,j,0));
                    visited[i][j]=1;
                }else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1){
                    countF++;
                }
            }
        }
        int[] dRow=new int[]{-1,0,1,0};
        int[] dCol=new int[]{0,1,0,-1};
        int time=0;
        while(!queue.isEmpty()){
            Pair3 p=queue.poll();
            int r=p.row;
            int c=p.col;
            int t=p.tim;
            time=Math.max(time,t);
            for(int i=0;i<4;i++){
                int row=r+dRow[i];
                int col=c+dCol[i];

                if(row>=0 && row<n && col>=0 && col<m && visited[row][col]!=1 && 
                    grid[row][col]==1){
                    queue.offer(new Pair3(row,col,t+1));
                    countF--;
                    visited[row][col]=1;
                }
            }
        }

        return countF!=0 ? -1 : time;
    }
}


class Pair3{
    int row;
    int col;
    int tim;

    Pair3(int r,int c,int t){
        row=r;
        col=c;
        tim=t;
    }
}
