import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

    public static void prisms(ArrayList<Edge> graph[]) {
        boolean visit[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        // int finalCost= 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (!visit[curr.v]) {
                visit[curr.v] = true;
                // finalCost +=curr.cost;
                ans.add(curr.cost);
                // find neighbors
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }

            }
        }
        System.out.println(ans);

    }

    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int index = 0; index < graph.length; index++) {
            graph[index] = new ArrayList<>();
        }

        // making graph
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
        graph[3].add(new Edge(3, 0, 30));

        prisms(graph);

    }
}

class Edge {
    int src;
    int dest;
    int wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

class Pair implements Comparable<Pair> {
    int v;
    int cost;

    Pair(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair p2) {
        return this.cost - p2.cost; // accending order sort on bases of cost
    }

}
