class Solution {
    int median(int matrix[][], int R, int C) {
        // code here  
        int n=R*C;
        int[] arr=new int[n];
        int k=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[k++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        
        return arr[n/2];
        
    }
}
