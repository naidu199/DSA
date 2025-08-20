class Solution {
    private ArrayList<Integer> ans;
    private boolean[] visited;
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v=adj.size();
        ans= new ArrayList<>();
        
        visited=new boolean[v];
        
        dfs(0,adj);
        return ans;
        
    }
    
    public void dfs(int n,ArrayList<ArrayList<Integer>> adj){
        visited[n] =true;
        ans.add(n);
        
        for(Integer i : adj.get(n)){
            if(!visited[i]){
                dfs(i, adj);
            }
        }
    }
}
