import java.util.*;

public class implementation {

    public static void main(String args[]) {

        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(3, 5));

        graph[1].add(new Edge(5, 4));
        graph[1].add(new Edge(5, 1));
        graph[1].add(new Edge(5, 3));

        graph[2].add(new Edge(4, 5));
        graph[2].add(new Edge(4, 1));
        graph[2].add(new Edge(4, 2));

        graph[3].add(new Edge(1, 4));
        graph[3].add(new Edge(1, 5));
        graph[3].add(new Edge(1, 2));

        graph[4].add(new Edge(2, 1));
        graph[4].add(new Edge(2, 4));

        for (int i = 0; i < graph[2].size(); i++) {

            Edge data = graph[2].get(i);
            System.out.println(data.dest);
        }

    }
}

class Edge {
    int src;
    int dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}