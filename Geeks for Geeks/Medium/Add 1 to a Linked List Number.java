class Solution {
    public Node addOne(Node head) {
        // code here.
        Node rev=reverse(head);
        Node ptr=rev;
        int carry=1;
       
        while(ptr!=null){
            ptr.data=ptr.data+carry;
            if(ptr.data<=9){
                carry=0;
                break;
            }else{
                ptr.data=0;
                carry=1;
            }
            ptr=ptr.next;
        }
       
        if(carry==1){
           
            Node node=new Node(1);
            node.next=rev;
            return node;
        }
        head=reverse(rev);
        
        return head;
        
    }
    public Node reverse(Node node){
        Node pre=null;
        Node next=null;
        while(node!=null){
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }
}
