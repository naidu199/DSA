class Solution {
    public int maximumCount(int[] nums) {
        int n=binarySearch(nums,0);
        int p=nums.length-binarySearch(nums,1);

        return p>n?p:n;
    }

    public int binarySearch(int[] nums, int target){
        int l=0,r=nums.length-1;
        int res=nums.length;
        while(l<=r){
            int mid=(l+r)/2;

            if(nums[mid]<target){
                l=mid+1;
            }else{
                res=mid;
                r=mid-1;
            }
        }
        return res;
    }
}
