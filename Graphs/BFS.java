import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void BFS_algo(ArrayList<Edge> graph[]){

        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

        q.add(3);

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

    public class implementation {
        public implementation() {
        }

}
}