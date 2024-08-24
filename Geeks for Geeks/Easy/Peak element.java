class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n==1) return 0;
       if(arr[0]>=arr[1]){
           return 0;
       }
       for(int i=1;i<n;i++){
           if(arr[i-1]<=arr[i]&&(i+1==n||arr[i+1]<=arr[i])){
               return i;
           }
       }
       return 0;
    }
}
