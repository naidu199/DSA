class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int close=0;
        for(int i:nums){
            int d=Math.abs(i);
            if(d<min||(d==min&&d>close)){
                close=i;
                min=d;
            }
        }
        return close;

    }
}
