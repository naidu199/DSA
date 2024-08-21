class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node cur=head_ref;
		for(int i=0;i<pos;i++){
		    cur=cur.next;
		}
		Node n=new Node(data);
		n.next=cur.next;
		n.prev=cur;
		cur.next=n;
		
	}
}
