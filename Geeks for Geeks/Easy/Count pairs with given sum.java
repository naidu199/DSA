class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i: arr){
            int d=target-i;
            
            if(map.containsKey(d)){
                c+=map.get(d);
            }
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return c;
    }
}
