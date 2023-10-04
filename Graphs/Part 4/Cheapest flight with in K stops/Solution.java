import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info {
        int vertex, cost, stop;

        Info(int v, int cost, int stop) {
            this.vertex = v;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);

            graph[src].add(e);

        }
    }

    public static int cheapestFlight(int flights[][],int n, int src, int dst, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];

        int dist[] = new int[n];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +INFINITY
            }
        }

        createGraph(flights, graph);

        Queue<Info> q = new LinkedList<>();

        q.add(new Info(src, 0,0));

        while(!q.isEmpty()){
            Info curr = q.poll();

            if(curr.stop>k){
                break;
            }

            for (int i = 0; i < graph[curr.vertex].size(); i++) {

                Edge e = graph[curr.vertex].get(i);
                int u= e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost + wt < dist[v] && curr.stop <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stop + 1));
                }
                

                
            }
        }
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dst];
        }

    }

    public static void main(String args[]) {
        int n = 3, src = 0, dst = 2, k = 1;
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500} };

        int result = cheapestFlight(flights, n, src, dst, k);

        if (result == -1) {
            System.out.println("No valid flight path found within given stops.");
        } else {
            System.out.println("Cheapest flight cost: " + result);
        }

    }

}
