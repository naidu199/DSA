class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        long c= mergeSort(arr,0,n-1);
        return c;
    }
    static long merge(long arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList<Long> ans = new ArrayList<>();
         int left=l;
         int right=m+1;
         long c=0;
         while(left<=m&&right<=r){
             if(arr[left]<=arr[right]){
                 ans.add(arr[left]);
                 left++;
             }else{
                 ans.add(arr[right]);
                 c+=(m-left+1);
                 right++;
             }
         }
         while(left<=m){
             ans.add(arr[left]);
             left++;
         }
          while(right<=r){
             ans.add(arr[right]);
             right++;
         }
         int index = l;
         
         for(long num: ans){
             arr[index] = num;
             index++;
         }
         
         return c;
    }
  static  long mergeSort(long arr[], int l, int r)
    {
        //code here
        long c=0;
       if(l>=r) return c;
        
        int mid = ( l + r)/2;
      c+=  mergeSort(arr, l, mid);
      c+=  mergeSort(arr, mid+1, r);
        
      c+=  merge(arr, l, mid, r);
      
      return c;
    }
}
