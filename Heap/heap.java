import java.util.*;

public class heap {

    public static class Pair implements Comparable<Pair> {
        String name;
        int roll;

        Pair(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        @Override
        public int compareTo(Pair p2) {
            // return p2.roll - this.roll; //Decending order
            return this.roll - p2.roll; // Accending order

        }
    }

    public static void main(String[] args) {

        Pair p1 = new Pair("raj", 11);
        Pair p2 = new Pair("null", 1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(p1);
        pq.add(p2);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().roll);
            pq.poll();
        }

    }
}
