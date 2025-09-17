class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int n:nums){
            if(list.isEmpty()|| list.get(list.size()-1)<n){
                list.add(n);
            }else{
                int idx=search(list,n);
                list.set(idx,n);
            }
        }

        return list.size();
    }

    public int search(List<Integer> list,int target){
        int r=list.size()-1;

        int l=0;
        while(l<=r){
            int mid=(l+r)/2;
            int val=list.get(mid);
            if(val==target){
                return mid;
            }else if(val>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return l;

    }
}
