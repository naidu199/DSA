class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i : nums){
            if(i==1){
                c++;
                if(c>max){
                    max=c;
                }
            }else{
                
                c=0;
            }
        }
        return max;
    }
}
