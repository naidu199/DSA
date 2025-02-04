class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans=nums[0],sum=nums[0];

        for(int i=1;i<nums.length;i++){
            sum=nums[i]>nums[i-1]? sum+nums[i] : nums[i];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
