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
    public void inOrderTraversal(TreeNode root, ArrayList<Integer> values){
        if(root == null) return;
         inOrderTraversal(root.left,values);
         values.add(root.val);
         inOrderTraversal(root.right,values);
 
    }
     public boolean isValidBST(TreeNode root) {
 
         if(root == null ) return true;
 
         ArrayList<Integer> values = new ArrayList<>();
 
         inOrderTraversal(root, values);
 
         for(int i=1; i<values.size(); i++){
             if(values.get(i)<=values.get(i-1)){
                 return false;
             }
         }
 
         return true;
         
     }
 }