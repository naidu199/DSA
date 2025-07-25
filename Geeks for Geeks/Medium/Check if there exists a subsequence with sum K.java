// User function Template for Java
//O(2^n)
class Solution {
    public static boolean checkSubsequenceSum(int n, int[] arr, int k) {
        // code here
         if(k==0){
            return true;
        }
        if(n==0){
            return false;
        }
        
        if(arr[n-1]>k){
          return  checkSubsequenceSum(n-1,arr,k);
        }else{
           return checkSubsequenceSum(n-1,arr,k-arr[n-1]) ||  checkSubsequenceSum(n-1,arr,k);
        }
        
        
        
    }
    
}

//O(n*k)
//recursion + memo
class Solution {
    public static boolean checkSubsequenceSum(int n, int[] arr, int k) {
        Boolean[][] dp = new Boolean[n + 1][k + 1];
        return subP(n, k, arr, dp);
    }

    private static boolean subP(int i, int target, int[] arr, Boolean[][] dp) {
        if (target == 0) return true;
        if (i == 0) return false;

        if (dp[i][target] != null) return dp[i][target];

        if (arr[i - 1] > target) {
            return dp[i][target] = subP(i - 1, target, arr, dp);
        }

        boolean take = subP(i - 1, target - arr[i - 1], arr, dp);
        boolean notTake = subP(i - 1, target, arr, dp);

        return dp[i][target] = take || notTake;
    }
}

