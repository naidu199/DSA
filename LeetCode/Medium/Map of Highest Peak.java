class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    q.offer(new int[]{i,j});
                    isWater[i][j]=0;
                }else{
                    isWater[i][j]=Integer.MAX_VALUE;
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
                int nrow= row + dRow[i];
                int ncol= col + dCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && 
                isWater[nrow][ncol]>isWater[row][col]+1){
                    isWater[nrow][ncol]=isWater[row][col]+1;
                    q.offer(new int[]{nrow,ncol});
                }
            }
        }

        return isWater;
    }
}
