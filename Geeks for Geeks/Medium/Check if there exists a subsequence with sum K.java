// User function Template for Java

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
