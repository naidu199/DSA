class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
        ans[0]=1;
       for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
       }
       int sf=1;
       for(int i=n-1;i>=0;i--){
            ans[i]*=sf;
            sf*=nums[i];
       }

       return ans;

    }
}

//OR

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int zero=0;
        int product=1;

        for(int i:nums){
            if(i==0){
                zero++;
                if(zero>1){
                    Arrays.fill(ans,0);
                    return ans;
                }
                continue;
            }
            
             product*=i;   
            
            
        }
        System.out.println(product);

        if(zero==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    ans[i]=product;
                }
                
            }
            return ans;
        }
        for(int i=0;i<n;i++){
            ans[i]=product/nums[i];
        }
        
        return ans;
    }
}
