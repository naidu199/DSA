class Solution {
    public int numberOfSubstrings(String s) {

        int c=0;
        int n=s.length();
        if(n<3){
            return c;
        }
      
         int[] seen={-1,-1,-1};
       for(int i=0;i<n;i++){
          seen[s.charAt(i)-'a']=i;
            if(seen[0]!=-1&&seen[1]!=-1&&seen[2]!=-1){
                 c+=1+Math.min(seen[0],Math.min(seen[1],seen[2]));
                
            }              
       }
        return c;
    }
}



===OR===


class Solution {
    public int numberOfSubstrings(String s) {

        int c=0;
        int n=s.length();
        if(n<3){
            return c;
        }
      

       for(int i=0;i<n;i++){
            int[] seen={-1,-1,-1};
            for(int j=i;j<n;j++){
                seen[s.charAt(j)-'a']=1;
                if(seen[0]!=-1&&seen[1]!=-1&&seen[2]!=-1){
                    c+=n-j;
                    break;
                }
            }
       }
        return c;
    }
}
