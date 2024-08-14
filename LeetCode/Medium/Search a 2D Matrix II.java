class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            boolean res=bs(matrix[i],target);
            if(res){
                return res;
            }
        }
        return  false;
    }

    public boolean bs(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        // System.out.println(arr[0]);
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return false;
    }
}
