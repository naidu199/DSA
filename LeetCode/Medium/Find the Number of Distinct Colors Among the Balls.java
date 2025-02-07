class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n=queries.length;
        int[] ans=new int[n];
        Map<Integer, Integer> ballColor = new HashMap<>(); 
        Map<Integer, Integer> colorFreq = new HashMap<>();
        int dist=0;

        for(int i=0;i<n;i++){
            int ball=queries[i][0];
            int color=queries[i][1];
            if(ballColor.containsKey(ball)){
                int preCol=ballColor.get(ball);
                colorFreq.put(preCol,colorFreq.get(preCol)-1);

                if(colorFreq.get(preCol)==0){
                    colorFreq.remove(preCol);
                    dist--;
                }
            }

            ballColor.put(ball,color);
           colorFreq.put(color,colorFreq.getOrDefault(color,0)+1);

           if(colorFreq.get(color)==1){
            dist++;
           }
            ans[i]=dist;

        }
        return ans;
    }
}
