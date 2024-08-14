class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            if(nums[s]==target){
                return(true);
            }
            if(nums[e]==target){
                return(true);
            }
            s++;
            e--;
        }
        return(false);
    }
    
}
