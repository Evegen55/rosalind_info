package algorithmic_heights.deg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleGraph {
	
	private int numVertices;
	private int numEdges;
	private Map<Integer,ArrayList<Integer>> EdgesMap;
	
	public SimpleGraph() {
		numVertices = 0;
		numEdges = 0;
		EdgesMap = new HashMap<Integer,ArrayList<Integer>>();
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int getNumEdges() {
		return numEdges;
	}
	
	/**
	 * Add new vertex to the graph.  
	 * This vertex will have as its index the next available integer.
	 * Precondition: contiguous integers are used to index vertices.
	 * @return index of newly added vertex 
	 */
	public int addVertex() {
		
		numVertices ++;
		
		//System.out.println("Adding vertex "+ numVertices);
		
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		
		if(!EdgesMap.containsKey(numVertices)) {
			EdgesMap.put(numVertices,  neighbors);
		}
		
		return numVertices-1;
	}
		
	/**
	 * Add new edge to the graph between given vertices,
	 * @param u Index of the start point of the edge to be added. 
	 * @param v Index of the end point of the edge to be added. 
	 */
	public void addEdge(int start , int end) {
		numEdges ++;
		//System.out.println("numVertices: " + numVertices + ", start: " + start + ", end: " + end);
		if (start <= numVertices && end <= numVertices) {
			ArrayList<Integer> arrl = EdgesMap.get(start);
			//System.out.println("size" + "\t" + arrl.size());
			arrl.add(end);
			//System.out.println("size after" + "\t" + arrl.size());	
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	
	/** 
	 * The degree sequence of a graph is a sorted (organized in numerical order 
	 * from largest to smallest, possibly with repetitions) list of the degrees 
	 * of the vertices in the graph.
	 * 
	 * @return The degree sequence of this graph.
	 */
	public List<Integer> degreeSequence() {
		List<Integer> seq = new ArrayList<Integer>();
		for (int i=1; i <= numVertices; i++ ) {
			seq.add(getOutNeighbors(i).size()+getInNeighbors(i).size());
		}
		return seq;
	}
	
	/**
	 * Implement the abstract method for finding all
	 * in-neighbors of a vertex.
	 * If there are multiple edges from another vertex
	 * to this one, the neighbor
	 * appears once in the list for each of these edges.
	 *
	 * @param v the index of vertex.
	 * @return List<Integer> a list of indices of vertices.
	 */
	public List<Integer> getInNeighbors(int v) {
		List<Integer> inNeighbors = new ArrayList<Integer>();
		for (int u : EdgesMap.keySet()) {
			//iterate through all edges in u's adjacency list and
			//add u to the inNeighbor list of v whenever an edge
			//with startpoint u has endpoint v.
			for (int w : EdgesMap.get(u)) {
				if (v == w) {
					inNeighbors.add(u);
				}
			}
		}
		return inNeighbors;
	}

	/**
	 * Implement the abstract method for finding all
	 * out-neighbors of a vertex.
	 * If there are multiple edges between the vertex
	 * and one of its out-neighbors, this neighbor
	 * appears once in the list for each of these edges.
	 *
	 * @param v the index of vertex.
	 * @return List<Integer> a list of indices of vertices.
	 */
	public List<Integer> getOutNeighbors(int v) {
		//System.out.println("---v--" + v + "EdgesMap size: " + EdgesMap.size() + "\t" + EdgesMap.get(0));
		return new ArrayList<Integer>(EdgesMap.get(v));
	}

	/**
	 * @see http://rosalind.info/problems/ddeg/
	 * @return
	 */
	public List<Integer> DoubleDegreeSequence() {
		List<Integer> seq = new ArrayList<Integer>();
		List<Integer> deg_seq = degreeSequence();
		int weight = 0;
		
		for (int i=1; i <= numVertices; i++ ) {
			//get a lists of a neighbors
			List<Integer> vertIn = getInNeighbors(i);
			List<Integer> vertOut = getOutNeighbors(i);
			
			//loop through :
			for(int k : vertIn) {
				int w = deg_seq.get(k-1);
				//System.out.println("vertex "+ i + " vertIn " + k + " weight " + w);
				weight = weight + w;
			}
			for(int k : vertOut) {
				int w = deg_seq.get(k-1);
				//System.out.println("	vertex "+ i + "	vertOut " + k + " weight " + w);
				weight = weight + w;
			}
			//add weight in a list
			seq.add(weight);
			//set weight as 0
			weight = 0;
		}
		return seq;
	}
	
}
