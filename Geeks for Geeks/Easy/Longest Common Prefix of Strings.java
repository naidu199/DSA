class Solution {
    public String longestCommonPrefix(String arr[]) {
        
        // code here
        String ans="";
        
        if(arr.length==0){
            return ans;
        }
        int len=arr[0].length();
        
        for(int i=1;i<arr.length;i++){
            if(len>arr[i].length()){
                len=arr[i].length();
            }
        }
        
        for(int i=0;i<len;i++){
           char c=arr[0].charAt(i);
           
           for(int j=1;j<arr.length;j++){
               char c1=arr[j].charAt(i);
               if(c1!=c){
                   return ans;
               }
              
           }
            ans= ans+c;
        }
        return ans;
        
    }
}
