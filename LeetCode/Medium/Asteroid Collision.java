class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
           int n=asteroids[i];
           if(n>0){
            stack.push(n);
           }else{
            while(!stack.isEmpty() && stack.peek()>0
             && stack.peek()<Math.abs(n)){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()==Math.abs(n)){
                stack.pop();
            }else if(stack.isEmpty() || stack.peek()<0 ){
                stack.push(n);
            }
           }
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.get(i);
        }
        return arr;
    }
}
