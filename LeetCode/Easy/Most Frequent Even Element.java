class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();

       int val=2000, f=0;

       for(int i: nums){
        if(i%2==0){
            int c=map.getOrDefault(i,0)+1;
            map.put(i,c);

            if(c>f || c==f && i< val){
                val=i;
                f=c;
            }
        }
        
       }
       return f==0?-1:val;
    }
}
