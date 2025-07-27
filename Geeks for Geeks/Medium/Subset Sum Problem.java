class Solution {
    private static Boolean[][] dp;
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        dp=new Boolean[arr.length+1][sum+1];
       
        return isExist(arr,sum,0);
    }
    
    static Boolean isExist(int arr[], int sum,int i){
        if(sum==0) return  true;
        if(i==arr.length) return  false;
        if(dp[i][sum]!=null){
            return dp[i][sum];
        }
        if(arr[i]>sum){
            dp[i][sum] = isExist(arr,sum,i+1);
        }else{
            dp[i][sum] = isExist(arr,sum,i+1) ||  isExist(arr,sum-arr[i],i+1);
        }
        return dp[i][sum];
    }
}
