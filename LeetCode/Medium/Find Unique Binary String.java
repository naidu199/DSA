class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder str=new StringBuilder();

        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                str.append('1');
            }else{
                str.append('0');
            }
        }
        return str.toString();
    }
}
