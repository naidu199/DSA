class Solution {
    public int longestContinuousSubstring(String s) {
       int l=0,r=1;
       int ans=1,c=0;
       if(s.length()==1){
        return 1;
       }
       while(r<s.length()){
        if(s.charAt(r)-s.charAt(r-1)==1){
            ans=Math.max(ans, r-l +1);
            r++;
            
        }else{
            l=r;
            r++;
        }
       }
       return ans;
    }
}
