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
class Solution{
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            int leftHeight=height(curr.left);
            int rightHeight=height(curr.right);
            if(Math.abs(leftHeight-rightHeight)>1){
                return false;
            }
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        return true;
    }
    public int height(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        int count=0;
        if(root==null){
            return count;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                if(curr!=null){
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
            }
            count++;
        }
        return count;
    }
}