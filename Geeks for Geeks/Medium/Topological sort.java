class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        boolean[] visited=new boolean[V];
        
        Stack<Integer> st=new Stack<>();
        List<List<Integer>> adjList=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            
            adjList.get(u).add(v);
        }
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(adjList,visited,i,st);
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
        return ans;
    }
    
    public static void dfs(List<List<Integer>> adjList,boolean[] visited,
    int curr, Stack<Integer> st){
        visited[curr]=true;
        
        for(int node: adjList.get(curr)){
            if(!visited[node]){
                dfs(adjList,visited,node,st);
            }
        }
        st.push(curr);
    }
}
