import java.util.*;

public class bipartileGraph {

    public static boolean bipartile(ArrayList<Edge> graph[]) {
        // colour array banao or usko sab -1 karo
        int color[] = new int[graph.length];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // BFS karo jab colour asign na ho
                q.add(i);
                color[i] = 0; // yellow
                while (!q.isEmpty()) {
                    int curr = q.poll();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1) {
                            int nextcolour = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextcolour;
                            q.add(e.dest);
                        } else if(color[e.dest] == color[curr]){
                            return false; // non bipartile
                        }
                    }
                }
            }
        }

        return true;

    }

    public static void main(String args[]) {

        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));

        System.out.println(bipartile(graph));

    }
}
