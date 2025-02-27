class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;

        HashSet<Integer> set=new HashSet<>();
        for(int i: arr) set.add(i);
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=arr[i], b=arr[j];
                int len=2;

                while(set.contains(a+b)){
                    int t=a+b;
                    a=b;
                    b=t;
                    len++;
                }
                ans=Math.max(len,ans);
            }
        }
        return ans>=3?ans:0;
    }
}
