class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair3> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    queue.offer(new Pair3(i,j,0));
                }else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        while(!queue.isEmpty()){
            Pair3 pair=queue.poll();
            int row=pair.row;
            int col=pair.col;
            int dis=pair.dis;

            int[] dRow={-1,0,1,0};
            int[] dCol={0,1,0,-1};

            for(int i=0;i<4;i++){
                int nrow=row+dRow[i];
                int ncol=col+dCol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                 mat[nrow][ncol] > dis+1 ){
                    mat[nrow][ncol] = dis+1;
                    queue.offer(new Pair3(nrow,ncol,dis+1));
                }
            }
        }

        return mat;
    }
}

class Pair3{
    int row;
    int col;
    int dis;
    Pair3(int r,int c,int d){
        this.row=r;
        this.col=c;
        this.dis=d;
    }
}
