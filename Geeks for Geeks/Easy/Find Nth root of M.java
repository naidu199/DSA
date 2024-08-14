package Easy;

class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        if(m==0||m==1){
            return m;
        }
        int s=1;
        int e=m;
        while(s<=e){
            int mid=(s+e)/2;
            if(Math.pow(mid,n)==m){
                return mid;
            }
            if(Math.pow(mid,n)>m){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
