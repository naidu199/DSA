class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashSet<Integer> visited=new HashSet<>();
        int v=isConnected.length;
        int ans=0;

        for(int i=0;i<v;i++ ){
            if(!visited.contains(i)){
                dfs(i,isConnected,visited);
                ans++;
            }
        }

        return ans;
    }

    public void dfs(int n,int[][] isConnected,HashSet<Integer> visited){
        visited.add(n);
        for(int i=0;i<isConnected[n].length;i++){
            if(isConnected[n][i]==1&&!visited.contains(i)){
                dfs(i,isConnected,visited);
            }
        }
    }
}
