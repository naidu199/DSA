//O(2^n * n)
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

//O(2^N)
class Solution {
    private ArrayList<List<Integer>> list;
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;

        list = new ArrayList<>();
        subSets(0,nums,new ArrayList<>());
        return list;
    }

    public void subSets(int i,int[] nums,ArrayList<Integer> sub){
        if(i==nums.length){
            list.add(new ArrayList<>(sub));
            return;
        }
        subSets(i+1,nums,sub);
        sub.add(nums[i]);
        subSets(i+1,nums,sub);
        sub.remove(sub.size() - 1);

    }
}

