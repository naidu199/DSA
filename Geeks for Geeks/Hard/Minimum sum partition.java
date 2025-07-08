

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int totalSum=0;
        int n=arr.length;
        for(int i : arr){
            totalSum+=i;
        }
        // if(totalSum%2==0) return 0;
        int half=totalSum/2;
        boolean[][] dp=new boolean[n+1][half+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=half;i++){
            dp[0][i]=false;
        }
        
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=half;j++){
                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j- arr[i-1]];
                }
            }
        }
        int minD=Integer.MAX_VALUE;
        for(int i=0;i<=half;i++){
            if(dp[n][i]==true){
                minD=Math.min(minD,totalSum-2*i);
            }
        }
        return minD;
        
    }
}
