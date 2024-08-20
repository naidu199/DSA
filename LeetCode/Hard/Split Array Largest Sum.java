class Solution {
    public int splitArray(int[] nums, int k) {
        int s=0;
        int e=0;
        for(int i:nums){
            if(i>s){
                s=i;
            }
            e+=i;
        }
        while(s<=e){
            int mid=(s+e)/2;
            int sub=subArr(nums,mid);
            if(sub>k){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
    }

    public int subArr(int[] arr,int val){
        int sub=1;
        int v=0;
        for(int i:arr){
            if((v+i)<=val){
                v+=i;
            }else{
                sub++;
                v=i;
            }
        }
        return sub;
    }
}
