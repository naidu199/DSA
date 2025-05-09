class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return numArrays(nums,k)- numArrays(nums,k-1);
    }

    public int numArrays(int[] nums, int k){
        if(k<0) return 0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
        }
        int i=0,j=0,c=0,ans=0;
        while(j<nums.length){
            c+=nums[j];
            while(c>k){
                c-=nums[i];
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}
