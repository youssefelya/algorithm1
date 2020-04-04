package graph;

import java.util.LinkedList;

public class Digraph {
    private final int V;
    private LinkedList<Integer>[] adj;
    //Digraph reverse;
    public Digraph(int v) {
        this.V = v;
        adj = new LinkedList[V];
        for(int i=0; i<V; i++)adj[i] = new LinkedList<>();
     //   reverse = new Digraph(V);
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
       // reverse.addEdge(w,v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

    public int V() {
        return V;
    }

    public Digraph reverse() {
        Digraph reverse = new Digraph(V);
        for(int i=0; i<=V; i++){
            for(int w : adj(i)){
                reverse.addEdge(w,i);
            }
        }
        return reverse;
    }
}
