class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
