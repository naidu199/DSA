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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        int ans=0;
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();

        q.add(new Pair<>(root,0));

        while(!q.isEmpty()){
            int size=q.size();

            int left=0,right=0;
            int min=q.peek().getValue();

            for(int i=0;i<size;i++){
                Pair<TreeNode, Integer> current = q.poll();
                int curI=current.getValue()-min;
                TreeNode node=current.getKey();

                if(i==0) left=curI;
                if(i==size-1) right=curI;
                if (node.left != null) {
                    q.add(new Pair<>(node.left, curI * 2 + 1));
                }
                if (node.right != null) {
                    q.add(new Pair<>(node.right, curI * 2 + 2));
                }
                ans = Math.max(ans, right - left + 1);
            }

        }

        return ans;
    }
}
