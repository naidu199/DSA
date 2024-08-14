package Medium;

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxC=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=arr[i].length-1;j>=0;j--){
                if(arr[i][j]==1){
                    c++;
                }else{
                    continue;
                }
            }
            if(c>maxC){
                maxC=c;
                index=i;
            }
        }
        return index;
    }
}
