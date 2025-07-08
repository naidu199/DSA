//Recursion 
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return countP(nums,0,0,target);
    }
    public int countP(int[] nums,int idx,int sum,int target){
        if(idx==nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }

        int sub=countP(nums,idx+1,sum-nums[idx],target);
        int add=countP(nums,idx+1,sum+nums[idx],target);
        return sub+add;
    }
}


//dp using memorization

class Solution {
    private Integer[][] dp;
    private int offset;
    public int findTargetSumWays(int[] nums, int target) {
        int totalS=0;
        for(int i:nums){
            totalS+=i;
        }
        int n=nums.length;
        dp=new Integer[n][2*totalS+1];
        offset=totalS;
        return countP(nums,0,0,target);
    }
    public int countP(int[] nums,int idx,int sum,int target){
        if(idx==nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }

        if(dp[idx][sum+offset]!=null){
            return dp[idx][sum+offset];
        }

        int sub=countP(nums,idx+1,sum-nums[idx],target);
        int add=countP(nums,idx+1,sum+nums[idx],target);
        dp[idx][sum+offset] = sub+add;
        return dp[idx][sum+offset];
    }
}
