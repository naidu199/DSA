// User function Template for Java

class Solution {
    int countStrings(int n) {
        // code here
        int zeroend=1;
        int oneend =1;
        int sum= zeroend+oneend;
        if(n==1) return sum;
        int i=2;
        
        while(i<=n){
            oneend=zeroend;
            zeroend=sum;
            sum=oneend+zeroend;
            i++;
        }
        return sum;
    }
}
