import java.util.*;

public class linkedlist {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node insertatfirst(Node head, Node new1) {
        new1.next = head;
        return new1;

    }

    static Node insertAtLast(Node head, Node new1) {

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }
        temp.next = new1;
        return head;
    }

    static Node insertAtMiddle(Node head, Node val, int pos) {

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;

        }
        val.next = temp.next;
        temp.next = val;

        return head;

    }

    public static void main(String args[]) {

        Node l1 = new Node(1);
        Node l2 = new Node(3);
        Node l3 = new Node(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        Node head = l1;
        Node new1 = insertatfirst(head, new Node(5));

        head = new1;
        Node new2 = insertAtLast(head, new Node(10));

        Node new3 = insertAtMiddle(head, new Node(33), 3);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
