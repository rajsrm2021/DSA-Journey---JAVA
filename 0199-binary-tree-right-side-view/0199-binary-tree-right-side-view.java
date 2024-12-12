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

    public void helper(TreeNode root, List<Integer> res, int level){

        if(root == null) return;

        if(level >= res.size()) res.add(root.val);

        helper(root.right,res,level+1);
        helper(root.left,res,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        helper(root, res, 0);

        return res;
        
    }
}