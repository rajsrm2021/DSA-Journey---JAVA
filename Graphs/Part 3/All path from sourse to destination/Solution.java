import java.util.*;

public class Solution {

    public static void allPath(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src==dest){
            System.out.println(path+dest);
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            allPath(graph, e.dest, dest, path+src);
            
        }
    }

    public static void main(String args[]) {

        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[5].add(new Edge(5,0 ));
        graph[5].add(new Edge(5,2 ));

        graph[4].add(new Edge(4,0 ));
        graph[4].add(new Edge(4,1 ));

        graph[2].add(new Edge(2,3 ));

        graph[3].add(new Edge(3,1 ));
        graph[0].add(new Edge(0, 3));

        int src  =5;
         int dest =1;

        allPath(graph, src, dest, "");

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