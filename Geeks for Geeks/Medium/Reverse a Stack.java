class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        
        if(s.isEmpty()) return;
        
        
        int top=s.pop();
        reverse(s);
        insertBottom(s,top);
    }
    
     static void insertBottom(Stack<Integer> s,int i) {
         
         if(s.isEmpty()){
             s.push(i);
             return;
         }
         
         int top=s.pop();
         insertBottom(s,i);
         s.push(top);
     }
}
