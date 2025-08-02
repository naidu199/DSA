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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);

    }

    public TreeNode build(int[] postorder,int ps,int pe,int[] inorder,int is,int ie, HashMap<Integer,Integer> map){
        if(is>ie||ps>pe){
            return null;
        }

        TreeNode node=new TreeNode(postorder[pe]);

        int idx=map.get(node.val);
        int numsL=idx-is;

        node.left=build(postorder,ps,ps+numsL-1,inorder,is,idx-1,map);
        node.right=build(postorder,ps+numsL,pe-1,inorder,idx+1,ie,map);
        return node;
    }
}
