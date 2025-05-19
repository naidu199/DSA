
class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() &&
             (i==n||heights[stack.peek()]>heights[i])){
                int h=heights[stack.pop()];
                int pmin=stack.isEmpty()? i : i- stack.peek() -1;
                int a=h*pmin;
                ans=Math.max(ans,a);
            }
            
            stack.push(i);
        }
        return ans;
    }   
}


Complexity
Time	O(n)
Space	O(n)

class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        int n=heights.length;
        int[] nse=nextSE(heights);
        int[] pse=prevSE(heights);
        for(int i=0;i<n;i++){
            int a=heights[i]*(nse[i]-pse[i]-1);
            ans=Math.max(a,ans);
        }
        return ans;
    }
    public int[] nextSE(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            nse[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return nse;
    }

    public int[] prevSE(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return pse;
    }
}

Complexity
Time	O(n^2)
Space	O(1)

class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        int n=heights.length;
        if(n==1){
            return heights[0];
        }
        for(int i=0;i<n;i++){
            int max=heights[i];
            int min=heights[i];
            for(int j=i+1;j<n;j++ ){
                min=Math.min(min,heights[j]);
                int a=(j-i+1)*min;
                max=Math.max(max,a);
            }
            if(max>ans){
                ans=max;
            }
        }
        return ans;
    }
}
