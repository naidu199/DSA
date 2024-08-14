class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c=0;
        for(int i: nums){
            c^=i;
        }
        return(c);
    }
}
