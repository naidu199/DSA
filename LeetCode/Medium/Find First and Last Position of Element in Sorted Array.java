class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int[] ans=new int[]{-1,-1};
        for(int i=0;i<len;i++ ){
            if(nums[i]==target){
                if(ans[0]==-1){
                    ans[0]=i;
                }
                ans[1]=i;
            }
        }
        return ans;
    }
}
