public class main {

    public static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;

        public Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static Boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];

            return front;
        }
    }

    public static void main(String args[]) {
        main q = new main(5);
        q.add(7);
        q.add(9);
        q.add(00);
        q.add(56);
        q.add(78);
        q.add(78);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}