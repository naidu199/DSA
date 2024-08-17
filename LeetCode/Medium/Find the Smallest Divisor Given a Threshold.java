class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int len=nums.length;
        
        int s=1;
        int e=getMax(nums);
    
        while(s<=e){
            int mid=(s+e)/2;
            if(canSmallestDivisor(nums,mid,threshold)){
              
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }

    public boolean canSmallestDivisor(int[] arr,int d,int t){
        int sum=0;
        for(int i:arr){
            sum+=Math.ceil((double)(i) / (double)(d));
            if(sum>t) return false;
        }
        return sum<=t;
    }

    public int getMax(int[] arr){
      
        int max=arr[0];
        for(int i:arr){
         
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}
