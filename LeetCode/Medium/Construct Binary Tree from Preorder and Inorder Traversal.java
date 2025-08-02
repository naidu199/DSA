/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1,inorder,0,n-1,map);

    }

    public TreeNode build(int[] preorder,int ps,int pe, int[] inorder,int is,int ie,HashMap<Integer,Integer> map){
        if(ps>pe||is>ie){
            return null;
        }
        TreeNode node = new TreeNode(preorder[ps]);
        int idx=map.get(node.val);
        int numsL=idx-is;

        node.left=build(preorder,ps+1,ps+numsL,inorder,is,idx-1,map);
        node.right= build(preorder,ps+1+numsL,pe,inorder,idx+1,ie,map);

        return node;
    }
}
