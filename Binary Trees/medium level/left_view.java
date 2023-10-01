//User function Template for Java
import java.util.*;
/* A Binary Tree node*/
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    public void result(Node root,ArrayList<Integer> res, int level ){
        if(root == null) return;
        
        if(res.size()==level) res.add(root.data);
        
        
        result(root.left,res,level+1);
        result(root.right,res,level+1);
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<>();
      result(root,res,0);
      return res;
    }
}