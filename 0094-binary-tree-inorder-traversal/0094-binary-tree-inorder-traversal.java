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

    public void helper(List<Integer>res, TreeNode root){

        if(root == null){
            return ;
        }
        helper(res, root.left);
        res.add(root.val);
        helper(res,root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        helper(res,root);

        return res;
    }
}