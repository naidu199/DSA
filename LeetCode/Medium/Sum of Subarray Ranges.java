//O(n^2)
class Solution {
    public long subArrayRanges(int[] nums) {
        long c=0;

        for(int i=0;i<nums.length;i++){
            long min=nums[i];
            long max=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                c+=max-min;
            }
        }
        return c;
    }
}
