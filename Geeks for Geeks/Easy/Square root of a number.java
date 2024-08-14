package Easy;

class Solution {
    long floorSqrt(long n) {
        // Your code here
        if(n==0||n==1){
            return n;
        }
        long s=1;
        long e=n;
        while(s<=e){
            long mid=(s+e)/2;
            if(mid==n/mid){
                return mid;
            }
            if(mid>n/mid){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
}
