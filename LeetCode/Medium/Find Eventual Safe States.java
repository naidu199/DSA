class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adjList=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        int[] degree=new int[n];

        for(int i=0;i<n;i++){
            for(int e: graph[i]){
                adjList.get(e).add(i);
            }
            degree[i]=graph[i].length;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==0) q.offer(i);
        }

        boolean[] safe=new boolean[n];

        while(!q.isEmpty()){
            int curr=q.poll();
            safe[curr]=true;
            for(int adj: adjList.get(curr)){
                degree[adj]--;
                if(degree[adj]==0){
                    q.offer(adj);
                }
            }
        }

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(safe[i]) ans.add(i);
        }

        return ans;
    }
}
