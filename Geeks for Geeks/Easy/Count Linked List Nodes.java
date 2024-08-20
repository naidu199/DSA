class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
}
