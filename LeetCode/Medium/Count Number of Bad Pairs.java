class Solution {
    public long countBadPairs(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i]-i,map.getOrDefault(nums[i]-i,0)+1);
        }
        long pairs=0L;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();

            if(val>=2){
                pairs+= (long) val*(val-1)/2;
            }
        }

        return (long)n*(n-1)/2 - pairs;
    }
}
