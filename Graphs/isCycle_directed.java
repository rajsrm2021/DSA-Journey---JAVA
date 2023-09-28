import java.util.ArrayList;

public class isCycle_directed {

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
               if (isCycle_Util(graph, i, visited,stack)){
                return true;
               }
            }
        }
        return false;
    }

    public static boolean isCycle_Util(ArrayList<Edge> graph[], int curr, boolean visit[], boolean stack[]) {
     
        visit[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){ 
                return true;
            }
            if (!visit[e.dest] && isCycle_Util(graph, e.dest, visit, stack) ) {
                return true ;
            }
        }

        stack[curr] = false;

        return false;
    }

    public static void main(String args[]) {

        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // graph[0].add(new Edge(0, 2));
        // graph[1].add(new Edge(1, 0));
        // graph[2].add(new Edge(2, 3));
        // graph[3].add(new Edge(3, 0));

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));

        graph[2].add(new Edge(2, 3));

        graph[1].add(new Edge(1, 3));

        System.out.println(isCycle(graph));;

    }
}