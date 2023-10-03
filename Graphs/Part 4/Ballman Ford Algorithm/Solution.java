import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

    public static void ballmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];

        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +INFINITY
            }
        }

        int V = graph.length;

        for (int i = 0; i < V - 1; i++) {

            // the two for loop is for finding the edge in graph

            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {

                    Edge e = graph[j].get(k);
                    // U, V, wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation

                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // print all source to vertex shortest dist
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int index = 0; index < graph.length; index++) {
            graph[index] = new ArrayList<>();
        }

        // making graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

     
        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));


        ballmanFord(graph, 0);
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
