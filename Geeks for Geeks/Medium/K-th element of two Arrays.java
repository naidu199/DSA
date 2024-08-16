class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here\
          // code here
        int n=arr1.length;
        int m=arr2.length;
        int j=0;
        int[] ans=new int[n+m];
        for(int i=0;i<n;i++)
        {
            ans[j++]=arr1[i];
        }
        for(int i=0;i<m;i++)
        {
            ans[j++]=arr2[i];
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
    
}
