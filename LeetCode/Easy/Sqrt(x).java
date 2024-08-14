package Easy;

class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int ans=0;
        int s=1;
        int e=x;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid == x / mid){
                ans= mid;
            }
            if(mid > x / mid){
                e=mid-1;
            }else{
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
}

