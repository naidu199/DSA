class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();

        
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prereq = edge[1];
            adjList.get(prereq).add(course); 
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses]; 

        
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (isCycle(i, visited, recStack, adjList)) {
                    return false; 
                }
            }
        }
        return true;
    }

    private boolean isCycle(int node, boolean[] visited, boolean[] recStack, List<List<Integer>> adjList) {
        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor] && isCycle(neighbor, visited, recStack, adjList)) {
                return true;
            } else if (recStack[neighbor]) {
                return true; 
            }
        }

        recStack[node] = false; 
        return false;
    }
}
