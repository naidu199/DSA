class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i: a){
            set.add(i);
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i : b){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }
        return ans;
    }
}
