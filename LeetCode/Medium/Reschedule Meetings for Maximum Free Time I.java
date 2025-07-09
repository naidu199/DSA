class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n=startTime.length;
        int[] pSum=new int[n+1];

        for(int i=0;i<n;i++){
            pSum[i+1]=pSum[i] + endTime[i]-startTime[i];
        }
        int res=0;
        for(int i=k-1;i<n;i++){
            int filled = pSum[i+1]-pSum[i-k+1];
            int start= i==k-1?0:endTime[i-k];
            int end= i== n-1 ? eventTime : startTime[i+1];

            res=Math.max(res, end- start - filled);
        }
        return res;
    }
}
