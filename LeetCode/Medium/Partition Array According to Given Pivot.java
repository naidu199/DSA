class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int c=0;
        int idx=0;
        for(int i:nums){
            if(i==pivot) c++;
        }

        for(int i: nums){
            if(i<pivot) ans[idx++]=i;
        }
        for(int i=0;i<c;i++){
            ans[idx++]=pivot;
        }

        for(int i:nums){
            if(i>pivot) ans[idx++]=i;
        }

        return ans;

    }
}
