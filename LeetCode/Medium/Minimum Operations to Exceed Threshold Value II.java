class Solution {
    public int minOperations(int[] nums, int k) {
        int mop=0;
        
        PriorityQueue<Long> pq=new PriorityQueue<>();
         for (int num : nums) {
            pq.offer((long) num);
        }
        while(!pq.isEmpty() && pq.peek() < k){

            if(pq.peek()>=k){
                return mop;
            }

            mop++;

            long x=pq.poll();
            long y=pq.poll();
            pq.offer(Math.min(x,y)*2+Math.max(x,y));

        }
        return mop;
    }
}
