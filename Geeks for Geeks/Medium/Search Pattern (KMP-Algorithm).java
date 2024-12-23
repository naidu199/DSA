class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
       
        ArrayList<Integer> res=new ArrayList<>();
         int[] lps=calLps(pat);
         int n=txt.length();
         int m= pat.length();
         int i=0;
         int j=0;
         while (i<n){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;j++;
                if(j==m){
                    res.add(i-j);
                    j=lps[j-1];
                }
                
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
         }
         return res;
    }
    
    int[] calLps(String pat){
        int[] lps=new int[pat.length()];
        
        int m=pat.length();
        int len=0;
        lps[0]=0;
        
       int i=1;
       while(i<m){
           if(pat.charAt(i)==pat.charAt(len)){
               len++;
               lps[i]=len;
               i++;
           }else{
              if(len!=0){
                  len=lps[len-1];
              }else{
                  lps[i]=0;
               i++; 
              }
           }
       }
       return lps;
    }
    
}
