class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        int[][] temp=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=mat[i][j];
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                mat[n-j-1][i]=temp[i][j];
            }
        }
    }
}
