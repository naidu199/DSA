class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int incr=1;
        int decr=1;
        for(int i=1;i<nums.length;i++){
            int n1=nums[i];
            int n2=nums[i-1];
            if(n2>n1){
                decr++;
                incr=1;
            }
          else if(n1>n2){
                incr++;
                decr=1;
            }
            else {
                incr=1;
                decr=1;
            }
           
            ans=Math.max(ans,Math.max(incr,decr));
        }
        
        return ans;
    }
}
