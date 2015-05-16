package Labyrinth;

/**
 * main program
 * @author natalia
 *
 */

public class Program {
	 
	 public static void main(String[] args) {
		 
		 //read info from file and initialize variables
	        In in = new In("tiny.txt");
		    Graph G = new Graph(in);
	        StdOut.println(G);
	        int s = 0;
	        DepthFirstPaths dfs = new DepthFirstPaths(G, s);
	        BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);
	        int lamp = G.getvLamp();
	        boolean isPathToLamp = dfs.hasPathTo(lamp);
	     // in this block we check if is route to lamp and print our checked points with their status
	        if (isPathToLamp) {
	        	StdOut.printf("\n%d to Lamp in %d: ", s, lamp);
	        	for (int x : dfs.pathTo(lamp)) {
                   if (x == s) {
                    	StdOut.print(x);
                    } else {
                    	StdOut.print(" " + x + " ");
                    }
                }
                StdOut.println();
                StdOut.println();
	        }
	        
	        /** 
	         * in this block we print our checked points with their status
	         * call dfs algorithm
	         */
	        
//	        for (int v = 0; v < G.getV(); v++) {
//	            if (dfs.hasPathTo(v)) {
//	                StdOut.printf("%d to %d:  ", s, v);
//	                for (int x : dfs.pathTo(v)) {
//	                    if (x == s) {
//	                    	StdOut.print(x);
//	                    } else {
//	                    	StdOut.print(" " + x + " ");
//	                    }
//	                }
//	                StdOut.println();
//	            } else {
//	                StdOut.printf("%d to %d:  not connected\n", s, v);
//	            }
//
//	        }
	    
	 
	 /**
	  * in this block we print our checked points with their status
	  *  call bfs algorithm
	  */
	 
	 
		 for (int v = 0; v < G.getV(); v++) {
	         if (bfs.hasPathTo(v)) {
	             StdOut.printf("%d to %d:  ", s, v);
	             for (int x : bfs.pathTo(v)) {
	                 if (x == s) {
	                 	StdOut.print(x);
	                 } else {
	                 	StdOut.print(" " + x + " ");
	                 }
	             }
	             StdOut.println();
	         } else {
	             StdOut.printf("%d to %d:  not connected\n", s, v);
	         }
	
	     }
	 }
	
}
