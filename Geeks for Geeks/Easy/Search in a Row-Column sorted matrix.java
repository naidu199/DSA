class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int row=mat.length;
        int col=mat[0].length;
        
        for(int i=row-1;i>=0;i--){
            if(mat[i][col-1]<x){
                return false;
            }
            
            if(mat[i][col-1]>=x){
                for(int j=col-1;j>=0;j--){
                    if(mat[i][j]==x){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
