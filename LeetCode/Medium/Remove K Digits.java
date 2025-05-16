class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        if(num.length()==0){
            return "0";
        }

        for(char c:num.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>c && k>0 ){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder ans= new StringBuilder();
        for(char c:stack){
            if(c=='0' && ans.length()==0){
                continue;
            }
            ans.append(c);
        }

        return ans.length()==0?"0":ans.toString();
    }
}
