import java.util.*;
// node class
public class TreeImplementation{
    static class Node{
        Node left,right;
        int data;
        
         Node(int data){
            this.data = data;
        }
    }
    // create tree
     public static Node CreateTree(){
         Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        
        if(data == -1) return null;
        
        root = new Node(data);
        
        System.out.println("Enter left data of " + data);
        
        root.left = CreateTree();
        
        System.out.println("Enter right data of " + data);
        
        root.right = CreateTree();
        
        return root;
    }
    
    // tree traversal
    
    public static void inOrder(Node root){
        if(root == null) return ;
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
     public static void preOrder(Node root){
        if(root == null) return ;
        
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
    
     public static void postOrder(Node root){
        if(root == null) return ;
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    
    public static int Height(Node root){
        if(root==null) return 0;
        
        return Math.max(Height(root.left),Height(root.right)) + 1;
    }
    // time complexity of O(N) in worst case like 
    public static void LevelOrder(Node root,int level){
        if(root == null) return ;
        
        if(level == 0) System.out.print(root.data+" ");
        
        else if(level>=1){
            LevelOrder(root.left,level-1);
            LevelOrder(root.right,level-1);
        }
    }
    
    // optimal level orderTraversal
    
    public static void LevelOrder2(Node root){
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            
        if(curr==null){
            if(q.isEmpty()) return;
            
            q.add(null);
            System.out.println();
        } else{
             System.out.print(curr.data+" ");
        
        if(curr.left!=null){
            q.add(curr.left);
        }
        
        if(curr.right!=null){
            q.add(curr.right);
        }
        }
            
       
        
        }
    }
   
    public static void main(String args[]){
        
        Node data = CreateTree();
        
        System.out.println("Inorder traversal");
        inOrder(data);
        System.out.println();

        System.out.println("preorder traversal");
        preOrder(data);
        System.out.println();
        
        System.out.println("postorder traversal");
        postOrder(data);
        System.out.println();
        
        
        System.out.println("Height of tree");
        int height=Height(data);
        System.out.println(height);
        System.out.println();
        
        
      System.out.println("level order traversal");
      for(int i=0;i<height;i++){
          LevelOrder(data,i);
      }
      
      System.out.println();
      
      System.out.println("optimal level order traversal");
      LevelOrder2(data);
        
        
    }
    
}