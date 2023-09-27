import java.util.*;

public class implementation {

    public static void BFS_algo(ArrayList<Edge> graph[]){

        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

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

    public static void DSF(ArrayList<Edge> graph[], int curr, boolean visit[]){

        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge data = graph[curr].get(i);
            if(!visit[data.dest]){
                DSF(graph, data.dest, visit);
            }
        }
    }

    public static boolean hashPath(ArrayList<Edge> graph[], int src, int dest, boolean visit[]) {
		if(src == dest) return true;
		visit[src] = true;
		for(int i=0;i<graph[src].size();i++) {
			Edge e = graph[src].get(i);
			
			if(!visit[e.dest] && hashPath(graph, e.dest, dest, visit) ) {
				return true;
			}
		}
		
		return false;
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

        for (int i = 0; i < graph[5].size(); i++) {

            Edge data = graph[5].get(i);
            System.out.println(data.dest);
        }
        System.out.print("BFS IS :");
        BFS_algo(graph);

        System.out.println();

        System.out.print("DFS IS :");
        DSF(graph, 0, new boolean[vertex]);

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