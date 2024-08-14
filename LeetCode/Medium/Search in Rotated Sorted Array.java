class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            if(nums[s]==target){
                return(s);
            }
            if(nums[e]==target){
                return(e);
            }
            s++;
            e--;
        }
        return(-1);
    }
}
