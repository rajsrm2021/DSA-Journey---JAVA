import java.util.*;

public class Cycle {

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (isCycle_Util(graph, i, visited, -1)) { // jis node se start karte hai uska parient nhi hota
                    return true;
                    // cycle exit in one of its parts
                }
            }
        }
        return false;

    }

    public static boolean isCycle_Util(ArrayList<Edge> graph[], int curr, boolean visit[], int parient) {

        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // three cases comes here
            // case 3:not visited
            if (!visit[e.dest]) {
                if (isCycle_Util(graph, e.dest, visit, curr)) {// current src is parient i.e. current
                    return true;
                }

            }

            // case1: already visited but not parient
            else if (visit[e.dest] && e.dest != parient) {
                return true;
            }

            // case 2: leave

        }

        return false;
    }

    public static void main(String args[]) {

        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));
        // graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        // graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

        System.out.println();

        System.out.print("Cycle IS :" + isCycle(graph));

    }
}
