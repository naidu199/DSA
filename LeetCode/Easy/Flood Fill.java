class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;

        int oc=image[sr][sc];
        if (oc == color) return image;
        Queue<Pair<Integer,Integer>> q=new LinkedList<>();

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};

        q.offer(new Pair(sr,sc));
        
        image[sr][sc]=color;

        while(!q.isEmpty()){
            Pair<Integer,Integer> p=q.poll();

            int r=p.getKey();
            int c=p.getValue();

            for(int i=0;i<4;i++){
                int nrow=r+dr[i];
                int ncol=c+dc[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && 
                image[nrow][ncol]==oc){
                    q.offer(new Pair(nrow,ncol));
                    
                    image[nrow][ncol]=color;
                }
            }
        }

        return image;
    }
}
