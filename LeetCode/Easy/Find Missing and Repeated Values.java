class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        boolean[] present=new boolean[n*n+1];
        int d=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(present[grid[i][j]]){
                d=grid[i][j];
            }else{
                present[grid[i][j]]=true;
            }
            }
        }

        for(int i=1;i<=n*n;i++){
            if(!present[i]){
                return new int[]{d,i};
            }
        }
        return  new int[]{};
    }
}
