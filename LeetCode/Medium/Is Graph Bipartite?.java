class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] colored=new int[n];
        Arrays.fill(colored,-1);
        for(int i=0;i<n;i++){
            if(colored[i]==-1){
                if(dfs(i,0,colored,graph)==false) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node,int color,int[] colored,int[][] graph){
        colored[node]=color;

        for(int adj : graph[node]){
            if(colored[adj]==-1){
                if(dfs(adj,1-color,colored,graph)==false) return false;
            }else if(colored[adj]==color){
                return false;
            }
        }
        return true;
    }
}
