class Solution {
  private List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list = new ArrayList<>();
        generateList(candidates, target, 0,new ArrayList<>());
        return list;
    }

    public void generateList(int[] candidates, int target,int i ,    List<Integer> sub){
        if(target==0){
            list.add( new ArrayList<>(sub));
            return;
        }
        if(i==candidates.length || target<0){
            return;
        }

        sub.add(candidates[i]);
        generateList(candidates,target-candidates[i],i,sub);
        sub.remove(sub.size() - 1); 
        generateList(candidates,target,i+1,sub);

    }
}
