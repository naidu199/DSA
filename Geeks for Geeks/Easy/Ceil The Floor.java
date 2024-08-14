class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int min = Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return new int[]{arr[i],arr[i]};
            }
            if(arr[i]<x){
                if(arr[i]>min){
                    min=arr[i];
                }
            }else{
                if(arr[i]<max){
                    max=arr[i];
                }
            }
            
        }
        
        if(min== Integer.MIN_VALUE) min=-1;
        if(max== Integer.MAX_VALUE) max=-1;
         return new int[]{min,max};
    }
}
