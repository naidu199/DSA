
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.data);
            head=head.next;
        }
        Collections.sort(list);
        Node ptr=new Node(0);
        Node ans=ptr;
        for(int i : list){
            ptr.next=new Node(i);
            ptr=ptr.next;
        }
        
        
        return ans.next;
        
    }
}
