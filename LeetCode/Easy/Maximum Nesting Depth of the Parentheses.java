class Solution {
    public int maxDepth(String s) {
        int max=0;
        Stack stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push('(');
                max=stack.size()>max?stack.size():max;
            }
            if(c==')'&& !stack.isEmpty()){
                stack.pop();
            }
        }
        return max;
    }
}
