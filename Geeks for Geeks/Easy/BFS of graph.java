class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v=adj.size();
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        
        boolean[] visited=new boolean[v];
        
        q.offer(0);
        visited[0]=true;
        
        while(!q.isEmpty()){
            int val=q.poll();
            
            ans.add(val);
            
            for(Integer i: adj.get(val)){
                // System.out.println(i);
                if(visited[i]==false){
                    visited[i]=true;
                    q.offer(i);
                }
            }
        }
        
        return ans;
    }
}
