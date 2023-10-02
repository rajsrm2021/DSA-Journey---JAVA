import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {

    public static void topSort( ArrayList<Edge> graph[]){
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                topSort_Util(graph,visit,stack, i);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void topSort_Util(ArrayList<Edge> graph[], boolean visit[], Stack<Integer> stack, int curr){
       
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                topSort_Util(graph, visit, stack, e.dest);
            }
            
        }

        stack.push(curr);
    }

    public static void main(String args[]) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];

        for (int index = 0; index < graph.length; index++) {
            graph[index] = new ArrayList<>();
        }

        // graph[5].add(new Edge(5,0 ));
        // graph[5].add(new Edge(5,2 ));

        // graph[4].add(new Edge(4,0 ));
        // graph[4].add(new Edge(4,1 ));

        // graph[2].add(new Edge(2,3 ));

        // graph[3].add(new Edge(3,1 ));

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));


        topSort(graph);
    }

}
