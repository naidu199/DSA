class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=0;
        int e=maxVal(piles);
        int ans=e;
        while(s<=e){
            int mid=(s+e)/2;
            int total=totalTime(piles,mid);
            if(total<=h){
         ans=mid;
                e=mid-1;
            }else{
               
                s=mid+1;
            }
        }
        return ans;
    }

    public int maxVal(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int totalTime(int[] arr,int k){
        int time=0;
        for(int i=0;i<arr.length;i++){
            time+=Math.ceil((double)(arr[i]) / (double)(k));
        }
        return time;
    }
}
