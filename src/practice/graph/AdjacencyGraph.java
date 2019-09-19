package practice.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyGraph {
	
	// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
	// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
	private static int V;
	private static LinkedList<Integer> adjacencyGraph[];
	AdjacencyGraph(int V) {
		this.V = V;
		adjacencyGraph = new LinkedList[V];
		for(int i = 0; i < V; i++)
			adjacencyGraph[i] = new LinkedList<>();
	}
	private static void addEdge(AdjacencyGraph graph, int src, int dest) {
		graph.adjacencyGraph[src].add(dest);
//		graph.adjacencyGraph[dest].add(src);
	}
	static void printGraph(AdjacencyGraph graph) {
		for(int i = 0; i < graph.V; i++) {
			System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjacencyGraph[i]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
		}
	}
	// prints BFS traversal from a given source s 
    static void BFS(int s) 
    { 
        // Mark all the vertices as not visited(By default 
        // set as false) 
        boolean visited[] = new boolean[V]; 
  
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> i = adjacencyGraph[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
 // A function used by DFS 
    static void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adjacencyGraph[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    } 
  
    static // The function to do DFS traversal. It uses recursive DFSUtil() 
    void DFS(int v) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
    } 
	public static void main(String[] args) {
		
//		int v = 5;
//		AdjacencyGraph graph = new AdjacencyGraph(v);
//		addEdge(graph, 0, 1);
//		addEdge(graph, 0, 4); 
//        addEdge(graph, 1, 2); 
//        addEdge(graph, 1, 3); 
//        addEdge(graph, 1, 4); 
//        addEdge(graph, 2, 3); 
//        addEdge(graph, 3, 4); 
//        
//        printGraph(graph); 
        
		int v = 4;
        AdjacencyGraph g = new AdjacencyGraph(v);
        addEdge(g, 0, 1); 
        addEdge(g, 0, 2); 
        addEdge(g, 1, 2); 
        addEdge(g, 2, 0); 
        addEdge(g, 2, 3); 
        addEdge(g, 3, 3); 
        
        printGraph(g);
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)");
        
        BFS(2);
        
        System.out.println("Following is Depth First Traversal "+ 
                "(starting from vertex 2)"); 

        DFS(2); 
	}
}
