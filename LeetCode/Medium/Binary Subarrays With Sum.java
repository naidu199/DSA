class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return  subArrays(nums,goal)- subArrays(nums,goal-1);
    }

    public int subArrays(int[] nums, int goal){
        if(goal<0) return 0;
        int c=0,s=0;
        int i=0,j=0;
        while(j<nums.length){
            s+=nums[j];

            while(s>goal){
                s-=nums[i];
                i++;
            }
            c+=j-i+1;
            j++;
        }
        return c;
    }
}
