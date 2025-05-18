class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[] rowSum=new int[n];
        int[] colSum=new int[m];

        long total=0,sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
                total+=grid[i][j];
            }
            rowSum[i]=(int)sum;
        }
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=grid[j][i];
                
            }
            colSum[i]=(int)sum;
        }
        long temp=0;
        for(int i=0;i<n;i++){
            temp+=rowSum[i];

            if(temp==total-temp) return true;
        }
        temp=0;
        for(int i=0;i<m;i++){
            temp+=colSum[i];

            if(temp==total-temp) return true;
        }
        return false;
    }
}
