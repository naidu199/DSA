class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='('){
                stack.push(')');
            }else{
                if(stack.isEmpty()||stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
