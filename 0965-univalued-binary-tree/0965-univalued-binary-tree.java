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
    public static boolean inorder(TreeNode root,TreeNode node){
        if(root==null){
            return true;
        }
        if(root.val!=node.val){
            return false;
        }
        if(!inorder(root.right,node)){
            return false;
        }
        if(!inorder(root.left,node)){
            return false;
        }
        return true;
    }
    public boolean isUnivalTree(TreeNode root) {
        TreeNode node=root;
        return inorder(root,node);
    }
}