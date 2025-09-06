import java.util.*;

class Solution {
    public boolean isBipartite(int V, int[][] edgeList) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edgeList) {
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] colored = new int[V];
        Arrays.fill(colored, -1);

        for (int i = 0; i < V; i++) {
            if (colored[i] == -1) {
                if (!dfs(i, 0, colored, adj)) return false;
            }
        }
        return true;
    }

    private boolean dfs(int node, int color, int[] colored, ArrayList<ArrayList<Integer>> adj) {
        colored[node] = color;

        for (int neigh : adj.get(node)) {
            if (colored[neigh] == -1) {
                if (!dfs(neigh, 1 - color, colored, adj)) return false;
            } else if (colored[neigh] == color) {
                return false;
            }
        }
        return true;
    }
}
