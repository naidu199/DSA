class Solution {
    public int tupleSameProduct(int[] nums) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod=nums[i]*nums[j];
                c+=map.getOrDefault(prod,0);
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }
        return c*8;
    }
}
