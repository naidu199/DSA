class Solution {
    public String clearDigits(String s) {
        String ans="";

        for(Character c: s.toCharArray()){
            if(c<=122 && c>=97){
                ans+=c;
            }else{
                ans=ans.substring(0,ans.length()-1);
            }
        }
        return ans;
    }
}
