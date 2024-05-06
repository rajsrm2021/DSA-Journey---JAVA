import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tree {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createTree() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);
        System.out.println("enter left data - > " + data);

        root.left = createTree();

        System.out.println("enter right data - > " + data);

        root.right = createTree();

        return root;

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr == null) {
                if (q.isEmpty()) {
                    return;
                }
                q.add(null);
                System.out.println();
            } else {
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {

        Node data = createTree();
        levelOrder(data);

    }
}
