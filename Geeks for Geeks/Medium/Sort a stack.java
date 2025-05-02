class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        if(!s.isEmpty()){
            int temp=s.pop();
            sort(s);
            sortedInsert(s,temp);
        }
        
        return  s;
    }
    
    public static void sortedInsert(Stack<Integer> s, int i){
        
        if(s.isEmpty()|| i>s.peek()){
            s.push(i);
            return;
        }
        
        int temp=s.pop();
        sortedInsert(s,i);
        s.push(temp);
    }
}
