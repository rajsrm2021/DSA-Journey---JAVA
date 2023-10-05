import java.util.PriorityQueue;

public class Solution  {

    static class Edge implements Comparable<Edge>{
        int dect;
        int cost;

        Edge(int d, int c){
            this.dect=d;
            this.cost=c;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost;
        }
        
    }

    public static int mimCost(int cities[][]){

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];
        int finalCost=0;
        pq.add(new Edge(0, 0));

        while(!pq.isEmpty()){
            Edge curr = pq.poll();
            if(!vis[curr.dect]){
                vis[curr.dect] = true;
                finalCost+= curr.cost;
            }

            for (int i = 0; i < cities[curr.dect].length; i++) {
                if(cities[curr.dect][i]!=0 &&  !vis[i]){
                    pq.add(new Edge(i, cities[curr.dect][i]));
                }
                
            }

        }

        return finalCost;
    }
    public static void main(String args[]) {

        int cities[][] = { { 0, 1, 2, 3, 4 }, { 1, 0, 5, 0, 7 }, { 2, 5, 0, 6, 0 }, { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        System.out.println(mimCost(cities));
    }
}