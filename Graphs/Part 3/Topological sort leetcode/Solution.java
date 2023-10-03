import java.util.*;

class Solution {
    class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void inDegreeHelper(ArrayList<Edge> graph[], int inDegree[]) {

        for (int i = 0; i < graph.length; i++) {
            int vertex = i;
            for (int j = 0; j < graph[vertex].size(); j++) {
                Edge e = graph[vertex].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static int[] topSort(ArrayList<Edge> graph[], int numCourses) {
        int inDegree[] = new int[graph.length];
        inDegreeHelper(graph, inDegree);
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[numCourses];
        int index = 0;

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            arr[index++] = curr;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;

                if (inDegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

        // Check if all courses can be completed
        if (index == numCourses) {
            return arr;
        } else {
            return new int[0]; // Return an empty array if there is a cycle
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<Edge> graph[] = new ArrayList[numCourses];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int[] edge = prerequisites[i];
            graph[edge[1]].add(new Edge(edge[1], edge[0]));
        }

        return topSort(graph, numCourses);
    }
}