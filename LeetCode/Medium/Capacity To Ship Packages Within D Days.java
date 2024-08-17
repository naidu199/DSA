class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int len=weights.length;
        int s=weights[0];
        int e=0;
        for(int i:weights){
            if(s<i) s=i;
            e+=i;
        }
        
        while(s<=e){
            int mid=(s+e)/2;
           
            if(isShipped(weights,mid,days)){
                
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;

    }

    public boolean isShipped(int[] weights,int c,int d){
        int days=1;
        int cap=0;
        for(int i:weights){
            if(cap+i>c){
                days++;
                cap=i;
            }else{
                cap+=i;
            }
        }
        return days<=d;

    }


   
 
}
