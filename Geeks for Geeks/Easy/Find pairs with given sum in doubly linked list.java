Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Node right=head;
        Node left=head;
        while(right.next!=null){
            right=right.next;
        }
        
        while(left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                res.add(pair);
                right=right.prev;
                left=left.next;
            }else if(left.data+right.data>target){
                right=right.prev;
            }else{
                left=left.next;
            }
        }
        return res;
    }
}
