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

    public int minValue(TreeNode root){
        if(root.left == null) return root.val;

        return minValue(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int key) {

        // leaf node
        if(root==null) return null;

        // searching
        if(root.val > key)  root.left = deleteNode(root.left, key);
        else if(root.val < key)  root.right = deleteNode(root.right, key);

        // deleting 
        else{
            // case 1 : left is null then return right
            if(root.left == null) return root.right;
            // case 2 : right is null then return left
            else if(root.right == null) return root.left;
            // both are not null then find inorder successor 
            root.val = minValue(root.right);
            // finally root is find now delete it again call delete
            root.right = deleteNode(root.right, root.val);
        }

        return root;
        
    }
}