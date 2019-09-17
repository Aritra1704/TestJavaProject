package practice.tree;

import java.util.Vector;

public class BFStree {

	public static void main(String[] args) {
		// adjacency graph for tree  
	    int V = 8;  
	    Vector<Vector<Integer>> graph=new Vector<Vector<Integer>>();  
	      
	    for(int i = 0; i < V + 1; i++) 
	    graph.add(new Vector<Integer>()); 
	  
	    graph.get(0).add(1);  
	    graph.get(0).add(2);  
	    graph.get(1).add(3);  
	    graph.get(1).add(4);  
	    graph.get(1).add(5);  
	    graph.get(2).add(5);  
	    graph.get(2).add(6);  
	    graph.get(6).add(7);  
	  
	    // call levels function with source as 0  
	    printLevels(graph, V, 0);  

	}

	private static void printLevels(Vector<Vector<Integer>> graph, int v, int i) {
		
		
	}

}
