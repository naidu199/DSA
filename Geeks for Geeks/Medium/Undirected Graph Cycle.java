class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(isCycleExist(i,visited,adj)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isCycleExist(int node,boolean[] visited,
    ArrayList<ArrayList<Integer>> adj){
        Queue<Pair> q=new LinkedList<>();
        visited[node]=true;
        q.offer(new Pair(node,-1));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int n=p.first;
            int pa=p.second;
            
            for(int adjNode: adj.get(n)){
                if(visited[adjNode]==false){
                    visited[adjNode]=true;
                    q.offer(new Pair(adjNode,n));
                }else if(pa!=adjNode){
                   return true; 
                }
            }
            
        }
        return false;
    }
    
    class Pair{
        int first;
        int second;
        
        Pair(int f,int s){
            this.first=f;
            this.second=s;
        }
    }
}
