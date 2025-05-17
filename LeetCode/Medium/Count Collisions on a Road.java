//stack based 

class Solution {
    public int countCollisions(String directions) {
        Stack<Character> stack=new Stack();
        int c=0;

        for(char ch:directions.toCharArray()){
           if(!stack.isEmpty()){
                

                if(stack.peek()=='R' && ch=='L'){
                    c+=2;
                    stack.pop();
                    ch='S';
                }else if(stack.peek()=='S' && ch=='L'){
                    c++;
                    ch='S';
                }

                while(!stack.isEmpty() && stack.peek()=='R'&&ch=='S'){
                    c++;
                    stack.pop();
                }
                stack.push(ch);
           }else{
            stack.push(ch);
           }
        }
        return c;
    }
}
