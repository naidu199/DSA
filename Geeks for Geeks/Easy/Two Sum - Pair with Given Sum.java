class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        
        for(int i:arr){
            int d=target-i;
            
            if(set.contains(d)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
