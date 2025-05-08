class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
       int r=0,l=0;
       int c=0;

       while(r<nums.length){
            int n=nums[r];
           if(n==0) c++;

           while(c>k){
            if(nums[l]==0) c--;
            l++;
           }
           if(c<=k){
            max=Math.max(max,r-l+1);
           }
           r++;
       }
       return max;
    }
}
