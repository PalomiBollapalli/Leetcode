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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=0;
        if(root==null){
            return al;
        }
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                if(curr!=null){
                    level.add(curr.val);
                    if(curr.right!=null) q.add(curr.right);
                    if(curr.left!=null) q.add(curr.left);
                }
            }
            if(c%2!=0){
                al.add(level);
            }else{
                Collections.reverse(level);
                al.add(level);
            }
            c++;
        }
        return al;
    }
}