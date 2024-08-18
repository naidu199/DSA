class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min=arr[i];
        int p=i;
        for(int j=i+1;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                p=j;
            }
        }
        return p;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<arr.length;i++){
	        int p=select(arr,i);
	        int temp=arr[p];
	        arr[p]=arr[i];
	        arr[i]=temp;
	    }
	    
	}
}
