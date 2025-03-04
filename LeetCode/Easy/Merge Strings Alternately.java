class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i=0,j=0;
        int n=word1.length();
        int m=word2.length();
        while(i<n&&j<m){
           ans.append(word1.charAt(i++));
           ans.append(word2.charAt(j++));
        }
        if(i<n){
            ans.append(word1.substring(i,n));
        }else{
            ans.append(word2.substring(j,m));
        }
        return ans.toString();
    }
}
