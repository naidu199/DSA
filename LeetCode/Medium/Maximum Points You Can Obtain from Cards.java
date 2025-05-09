class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int ls=0,rs=0;

        for(int i=0;i<k;i++){
            ls+=cardPoints[i];
        }
        max=ls;

        for(int i=k-1,j=cardPoints.length-1;i>=0;i--){
            ls-=cardPoints[i];
            rs+=cardPoints[j];
            j--;
            max=Math.max(max,ls+rs);
        }
        return max;
        
    }
}
