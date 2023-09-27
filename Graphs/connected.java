import java.util.*;

public class connected {

    public static void BFS(ArrayList<Edge> graph[]){ //  This function is created for doing DFS for unconnected graph also

        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {

            if(!visited[i]){
                BFS_Util(graph, visited);
            }
            
        }

    }

    public static void BFS_Util(ArrayList<Edge> graph[], boolean[] visited){ // this is helper function for DFS

        Queue<Integer> q = new LinkedList<>();
        

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.poll();
            
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }


    public static void DFS(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                DSF_Util(graph, i, visited);
            }
            
        }

    }

    public static void DSF_Util(ArrayList<Edge> graph[], int curr, boolean visit[]){

        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge data = graph[curr].get(i);
            if(!visit[data.dest]){
                DSF_Util(graph, data.dest, visit);
            }
        }
    }


    public static void main(String args[]) {

        int vertex = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
       
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));


        System.out.print("BFS IS :");
        BFS(graph);

        System.out.println();

        System.out.print("DFS IS :");
        DFS(graph);

    }
}

