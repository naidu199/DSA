class Solution {
    int countSubstr(String s, int k) {
        // your code here
        int n=s.length();
        int ans=distinct(s,k,n)-distinct(s,k+1,n);
        return ans;
    }
    
    int distinct(String s,int k,int n){
        int[] count=new int[26];
        int i=0,j=0;
        int f=0;
        int ans=0;
        
        for(i=0;i<n;i++){
            while(j<n && f<k){
                count[s.charAt(j)-'a']++;
                if(count[s.charAt(j)-'a']==1){
                    f++;
                }
                j++;
                
            }
            
            if(f>=k){
                ans+=n-j+1;
            }
            count[s.charAt(i)-'a']--;
            
            if(count[s.charAt(i)-'a']==0){
                    f--;
                }
            
        }
        return ans;
    }
}
