package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstPaths {
    private boolean[] marked;
    private int edgeTo[];

    public BreadthFirstPaths(Graph G, int s){
        marked=new boolean[s];
        edgeTo = new int[s];
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(s);
    while(!queue.isEmpty()){
        int v = queue.poll();
        for(int w : G.adj(v)){
            if(!marked[w]){
                marked[w] = true;
                queue.add(w);
                edgeTo[w]=v;
            }
        }
    }
    }
}
