class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArrays(nums,k)- subArrays(nums,k-1);
    }
    public int subArrays(int[] nums,int k){

        int l=0,r=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                if(map.get(nums[l])==1){
                    map.remove(nums[l]);
                }else{
                   map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                }
                l++;
            }
                ans+=r-l+1;

            r++;
        }
        return ans;

    }
}
