package Labyrinth;

public class Graph {
	
	private final int V;
	private Bag<Integer>[] adj;
	private int vLamp;
	
	// initialize constructor with int
	
	public Graph(int V) {
		this.V=V;
		adj = (Bag<Integer>[]) new Bag[V];
		for (int v=0; v<V; v++) {
			adj[v] = new Bag<Integer>();
		}
		vLamp = 1 + (int)(Math.random()*V); // random select value for lamp
	}
	
	// initialize constructor with input
	
	public Graph(In in) {
		this(in.readInt());
		int E = in.readInt();
		for (int i = 0; i < E; i++) {
			int v = in.readInt();
			int w = in.readInt();
			addEdge(v, w);
		}
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
		adj[w].add(v);
	}
	
	
	public int degree(int v){
		int degree = 0;
		for (int w : adj(v))
			degree++;
		return degree;
	}
	
	/* getters */
	
	public Bag<Integer>[] getAdj() {
		return adj;
	}


	public int getV() {
		return V;
	}


	public Iterable<Integer> adj(int v){
		return adj[v];
	}

	
	public int getvLamp() {
		return vLamp;
	}

	
}
