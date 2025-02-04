class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row=mat.length;
        int col=mat[0].length;
        
    
        
        for(int i=0;i<row;i++){
            if(mat[i][0]<=x&&mat[i][col-1]>=x){
                for(int j=0;j<col;j++){
                    if(mat[i][j]==x){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
