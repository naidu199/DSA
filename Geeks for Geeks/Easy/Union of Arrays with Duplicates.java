class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        
        for(int i: a){
            set.add(i);
        }
        for(int i: b){
            set.add(i);
        }
        return set.size();
    }
}
