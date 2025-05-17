class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i1=-1;
        
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                i1=i;
                break;
            }
        }
        if(i1==-1){
             reverse(nums,0,n-1);
             return;
        }
        for(int i=n-1;i>i1;i--){
            if(nums[i]>nums[i1]){
                int t=nums[i];
                nums[i]=nums[i1];
                nums[i1]=t;
                break;
            }
             
        }
        reverse(nums,i1+1,n-1);

    }

    public static void reverse(int[] arr,int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}
