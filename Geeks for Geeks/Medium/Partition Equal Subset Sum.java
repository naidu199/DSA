class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        
        int sum = 0;
        int n= arr.length;
        for(int i: arr){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        int t=sum/2;
        boolean[][] dp= new boolean[n+1][t+1];
        
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<t;i++){
            dp[0][i]=false;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=t;j++){
                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][t];
        
    }
}
