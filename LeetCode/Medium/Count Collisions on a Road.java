//simulation based

class Solution {
    public int countCollisions(String directions) {
        int c=0,n=directions.length();
        char[] arr=directions.toCharArray();
        int l=0,r=n-1;
        while (l < n && arr[l] == 'L') l++;

        while (r >= 0 && arr[r] == 'R') r--;

        while(l<=r){
            if(arr[l]!='S'){
                c++;
                
            }
            l++;
        }
        return c;
    }
}

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
