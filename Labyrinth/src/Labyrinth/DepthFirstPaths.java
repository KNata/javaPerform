package Labyrinth;

import java.util.Stack;

public class DepthFirstPaths {
	
	// here we find right way

	private boolean[] marked;    
    private int[] edgeTo;        
    private final int s;         
    
    public DepthFirstPaths(Graph G, int s) {
        this.s = s;
        edgeTo = new int[G.getV()];
        marked = new boolean[G.getV()];
        dfs(G, s);
    }
    
   
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }
    
   
    public boolean hasPathTo(int v) {
        return marked[v];
    }
    
  
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
        	return null;
        }
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }
    
   
}