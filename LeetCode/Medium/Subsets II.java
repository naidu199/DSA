class Solution {
    public List<List<Integer>> list;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        list=new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(nums,0,new ArrayList<>());
        return list;
    }

    public  void generateSubsets(int[] nums,int i,List<Integer> sub){
        list.add(new ArrayList<>(sub));
        for(int j=i;j<nums.length;j++ ){
            if(j>i && nums[j]==nums[j-1]) continue ;
            sub.add(nums[j]);
            generateSubsets(nums,j+1,sub);
            sub.remove(sub.size() - 1);
        }
    }
}
