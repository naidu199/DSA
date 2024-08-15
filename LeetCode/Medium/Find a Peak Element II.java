class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            int maxEle=maxInRow(mat[mid],m);
            int top=mid==0?-1:mat[mid-1][maxEle];
            int bottom=mid==n-1?-1:mat[mid+1][maxEle];
            if(mat[mid][maxEle]>top && mat[mid][maxEle]>bottom){
                return new int[]{mid,maxEle};
            }
            if(mat[mid][maxEle]<top){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public int maxInRow(int[] row,int m){
        int max=-1;
        int index=-1;
        for(int i=0;i<m;i++){
            if(row[i]>max){
                max=row[i];
                index=i;
            }
        }
        return index;
    }
}
