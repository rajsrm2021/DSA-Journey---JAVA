import java.util.*;

public class double_linkedlist {

    static public class node {
        int val;
        node prev;
        node next;

        public node(int val) {
            this.val = val;
            prev = null;
            next = null;
        }
    }

    public static void main(String[] args) {

        node l1 = new node(1);
        node l2 = new node(2);
        node l3 = new node(3);
        node l4 = new node(4);

        l1.next = l2;

        l2.next = l3;
        l2.prev = l1;

        l3.next = l4;
        l3.prev = l2;

        l4.prev = l3;

        node temp = l1;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        temp = l4;
        System.err.println();
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.prev;
        }

    }

}
