//optimal
class Solution {
    public void sortColors(int[] nums) {
        int l=0,mid=0,r=nums.length-1;

        while(mid<=r){
            if(nums[mid]==0){
                swap(nums,l,mid);
                l++;
                mid++;
            
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,r);
                r--;
            }
        }
    }

    public void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}

//OR

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}

// or

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int[] count=new int[3];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count[0]+=1;
            }
            if(nums[i]==1){
                count[1]+=1;
            }
            if(nums[i]==2){
                count[2]+=1;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count[0]){
                nums[i]=0;
            }
            else if(i<count[0]+count[1]){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }
}
