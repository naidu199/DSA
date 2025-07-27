class Solution {
    private List<List<Integer>> list;
    public List<List<Integer>> combinationSum3(int k, int n) {
        list=new ArrayList<>();
        generateSubArrays(k,n,1,new ArrayList<>());
        return list;
    }

    public void generateSubArrays(int k,int n,int i,List<Integer> sub){
        if(sub.size()==k && n==0){
            list.add(new ArrayList<>(sub));
            return;
        }

        if(sub.size()>k || n<0 || i>9){
            return;
        }

        sub.add(i);
        generateSubArrays(k,n-i,i+1,sub);
        sub.remove(sub.size()-1);
        generateSubArrays(k,n,i+1,sub);
    }
}
