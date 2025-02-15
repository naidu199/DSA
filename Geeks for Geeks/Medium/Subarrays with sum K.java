class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int ans=0;
        int cSum=0;
        
        for(int i: arr){
            cSum+=i;
            
            if(cSum==k){
                ans++;
            }
            
            if(map.containsKey(cSum-k)){
                ans+=map.get(cSum-k);
            }
            map.put(cSum,map.getOrDefault(cSum,0)+1);
        }
        return ans;
    }
}
