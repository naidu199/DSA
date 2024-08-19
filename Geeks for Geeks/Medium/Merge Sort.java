class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList<Integer> ans = new ArrayList<>();
         int left=l;
         int right=m+1;
         while(left<=m&&right<=r){
             if(arr[left]<arr[right]){
                 ans.add(arr[left]);
                 left++;
             }else{
                 ans.add(arr[right]);
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
         
         for(int num: ans){
             arr[index] = num;
             index++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
       if(l>=r) return;
        
        int mid = (l+(r-1))/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        merge(arr, l, mid, r);
    }
}
