class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
       
        if(n<((long) m * k)){
            return -1;
        }
        int[] val=minMax(bloomDay);
        int s=val[0];
        int e=val[1];
        while(s<=e){
            int mid=(s+e)/2;
            if(possible(bloomDay,mid,m,k)){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
    public boolean possible(int[] arr,int day,int m,int k){
        int n=0;
        int c=0;
        for(int i:arr){
            if(i<=day){
                c++;
            }else{
                n+=c/k;
                c=0;
            }
        }
        n+=c/k;
       return n>=m;
    }
    public int[] minMax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        return new int[]{min,max};
    }
}
