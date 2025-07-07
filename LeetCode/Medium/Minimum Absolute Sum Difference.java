class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] sorted=nums1.clone();
        Arrays.sort(sorted);
        long td = 0;
        int MOD = 1000000007;
        long ans = 0;
        for(int i=0;i<n;i++){
            td+=Math.abs(nums1[i]-nums2[i]);
        }
        ans=td;
        for(int i=0;i<n;i++){
            int idx=find_index(nums2[i],sorted);

            int l=idx==0?0:idx-1;
            int r=idx==n?idx-1:idx;
            int d = Math.min(
                Math.abs(nums2[i] - sorted[l]),
                Math.abs(nums2[i] - sorted[r])
                );
            ans=Math.min(ans,(td-Math.abs(nums1[i]-nums2[i]))+d);
        }
       return (int)(ans % MOD);
    }

    public int find_index(int n,int[] nums){
        int l=0;
        int r=nums.length-1;

        while(l<r){
            int m=(l+r)/2;
            if(nums[m]==n){
                return m;
            }
            else if(nums[m] > n){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}
