class Solution {
    static List<List<Integer>> list;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        list= new ArrayList<>();
        Arrays.sort(candidates);
        generateLists(candidates,target,0,new ArrayList<>());
        return list;
    }

    public static void generateLists(int[] candidates, int target,int i,List<Integer> sub){
        if(target==0){
            list.add(new ArrayList<>(sub));
            return;
        }
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]) continue;

            if(candidates[j]>target) break;
            sub.add(candidates[j]);
            generateLists(candidates,target-candidates[j],j+1,sub);
            sub.remove(sub.size()-1);
        }
    }
}
