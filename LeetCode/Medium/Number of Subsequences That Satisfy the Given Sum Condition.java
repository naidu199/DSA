class Solution {
    public int numSubseq(int[] nums, int target) {
        int n=nums.length;
        int c=0;
        int MOD = 1000000007;
        Arrays.sort(nums);
        int[] p=new int[n];
        p[0]=1;
        for(int i=1;i<n;i++){
            p[i]=(p[i-1]*2)% MOD;
        }
        int l=0,r=n-1;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                c = (c+ p[r-l])%MOD;
                l++;
            }else{
                r--;
            }
        }
        return c;
    }
}

