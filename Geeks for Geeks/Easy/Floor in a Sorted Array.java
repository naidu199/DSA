class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
        
    }
}
