package BFS_traversal;
import java.util.*;
public class bfs {

    static void traverse(List<List<Integer>> adjList, int v, int start, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+" ");
            for(int neighbour : adjList.get(node)) {
                if(!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0 ; i<v; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int i=0 ; i<e; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            adjList.get(src).add(des);
            adjList.get(des).add(src);
        }
        traverse(adjList, v,0, new boolean[v]);
        sc.close();
    }
}
