public class stack {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static int pop(node head) {
        if (head == null) {
            throw new IllegalStateException("empty stack");
        }
        int data = head.data;
        head = head.next;

        return data;

    }

    public static node push(node head, node newhead) {
        newhead.next = head;

        return newhead;

    }

    public static void main(String[] args) {

        node l1 = new node(1);
        node l2 = new node(2);
        node l3 = new node(3);

        l1.next = l2;
        l2.next = l3;
        node updatedHead = push(l1, new node(55));
        node temp = updatedHead;

        while (temp != null) {

            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println();

        System.out.println(pop(l1)); // pop operation

    }

}
