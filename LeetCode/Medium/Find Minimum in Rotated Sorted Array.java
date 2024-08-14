class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]<min){
                min=nums[start];
            }
            if(nums[end]<min){
                min=nums[end];
            }
            start++;
            end--;
        }
        return min;
    }
}
