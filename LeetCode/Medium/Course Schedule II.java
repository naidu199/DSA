class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        int[] degree=new int[numCourses];
        for(int[] a: prerequisites){
            int course=a[0];
            int preq=a[1];

            adjList.get(preq).add(course);
            degree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(degree[i]==0) q.offer(i);
        }

        int i=0;
        int[] order=new int[numCourses];

        while(!q.isEmpty()){
            int curr=q.poll();
            order[i++]=curr;
            for(int edge: adjList.get(curr)  ){
                degree[edge]--;
                if(degree[edge]==0) q.offer(edge);
            }

        }

        return i==numCourses? order : new int[0];
        
    }
}
