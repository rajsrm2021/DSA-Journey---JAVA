import java.util.*;

public class topologicalSort {

    // khan's Algorithm

    public static void inDegreeHelper(ArrayList<Edge> graph[],int inDegree[]){

        for(int i=0;i<graph.length;i++){
            int vertex = i;
            for(int j=0;j<graph[vertex].size();j++){
                Edge e = graph[vertex].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]){

        int inDegree[] = new int[graph.length];
        inDegreeHelper(graph, inDegree);

        Queue<Integer>q = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i]==0){
                q.add(i);
            }
            
        }
        // BFS 
        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr + " ");// topological sort print

           for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            inDegree[e.dest]--;

            if(inDegree[e.dest] == 0){
                q.add(e.dest);
            }
           }
        }
        System.out.println();

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

        // for (int i = 0; i < graph[5].size(); i++) {

        //     Edge data = graph[5].get(i);
        //     System.out.println(data.dest);
        // }

        topSort(graph);
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