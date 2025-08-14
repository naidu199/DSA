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

O(N*N) 
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);

        for(int i=1;i<preorder.length;i++){
            int val=preorder[i];
            TreeNode node=root;

            while(true){
                if(node.val>val){
                    if(node.left!=null){
                        node=node.left;
                    }else{
                        node.left=new TreeNode(val);
                        break;
                    }
                }else{
                   if(node.right!=null){
                        node=node.right;
                    }else{
                        node.right=new TreeNode(val);
                        break;
                    } 
                }
            }
        }

        return root;
    }
}
// O(N)


class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public TreeNode bst(int[] arr,int ub,int[] i){
        if(arr.length==i[0]||arr[i[0]]>ub) return null;

        TreeNode root=new TreeNode(arr[i[0]++]);

        root.left=bst(arr,root.val,i);
        root.right=bst(arr,ub,i);

        return root;
    }
}
