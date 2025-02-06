class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int r:row){
            for(int i=0;i<n;i++){
                mat[r][i]=0;
            }
        }
        
         for(int c:col){
            for(int i=0;i<m;i++){
                mat[i][c]=0;
            }
        }
    }
}
