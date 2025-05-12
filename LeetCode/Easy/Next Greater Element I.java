class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2=nums2.length;
        int[] ans=new int[n2];
        Stack<Integer> stack=new Stack<>();
        for(int i=n2-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                stack.pop();
            }
            ans[i]=stack.isEmpty()?-1:stack.peek();

            stack.push(nums2[i]);
        }
        int n1=nums1.length;
        int[] fans=new int[n1];

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    fans[i]=ans[j];
                    break;
                }
            }
        }
        return fans;

    }
}
