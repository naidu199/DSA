class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<Math.pow(2, n);i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1 << j)) != 0){
                    arr.add(nums[j]);
                }
            }
            ans.add(arr);
        }
        return ans;
    }
}
