/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public static int findMax(Node root) {
        // code here
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int res=root.data;
        
        int lf=findMax(root.left);
        int rt=findMax(root.right);
        
        if(lf>res) res=lf;
        if(rt>res) res=rt;
        
        return res;
    }

    public static int findMin(Node root) {
        
        // code here
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int res=root.data;
        
        int lf=findMin(root.left);
        int rt=findMin(root.right);
        
        if(lf<res) res=lf;
        if(rt<res) res=rt;
        
        return res;
    }
}
