/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";

        StringBuilder str=new StringBuilder();
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int n=queue.size();
            TreeNode node=queue.poll();
            if(node==null){
                str.append("#,");
            }else{
                str.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;

        Queue<TreeNode> queue=new LinkedList<>();

        StringBuilder s = new StringBuilder(data);
        int commaIndex = s.indexOf(",");
        String str = s.substring(0, commaIndex);
        s.delete(0, commaIndex + 1);
        TreeNode root = new TreeNode(Integer.parseInt(str));
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node=queue.poll();

            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);

            if(!str.equals("#")){
                TreeNode leftNode = new TreeNode(Integer.parseInt(str));
                node.left = leftNode;
                queue.offer(leftNode);
            }
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
            if (!str.equals("#")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(str));
                node.right = rightNode;
                queue.offer(rightNode);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
