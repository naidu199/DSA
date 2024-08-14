class Solution {
    public int findPeakElement(int[] nums) {
        int len=nums.length;
        if(len==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[len-1]>nums[len-2]) return len-1;

        int s=1;
        int e=len-2;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            if(nums[mid]>nums[mid-1]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
