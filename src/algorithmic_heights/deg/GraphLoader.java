package algorithmic_heights.deg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GraphLoader {
	
	/**
	 * Loads a simple graph from a file.  
	 * The file is specified with each line representing an edge.  
	 * Vertices are numbered from 0..1-numVertices.
	 * 
	 * The first line of the file contains:
	 * 	a single int which is the number of vertices in the graph.
	 *  a single int which is the number of edges
	 * e.g. 
	 * 5 4
	 * 1 3
	 * 3 2
	 * 3 5
	 * 5 4
	 * 
	 * @param filename The file containing the graph
	 * @param theGraph The graph to be loaded
	 */
	public static void loadSimpleGraph(String filename, SimpleGraph theGraph)
	{
		BufferedReader reader = null;
        try {
            String nextLine;
            reader = new BufferedReader(new FileReader(filename));
            nextLine = reader.readLine();
            
            if (nextLine == null) {
            	reader.close();
            	throw new IOException("Graph file is empty!");
            }
            
            //read first line, split it
            String[] arr1 = nextLine.split(" ");
           
            //read first symbol as number of vertices
            int numVertices = Integer.parseInt(arr1[0]);
            for (int i = 0; i < numVertices; i++) {
            	theGraph.addVertex();
            	//System.out.println("theGraph.addVertex(): " + theGraph.addVertex());
            }
            
            //read second symbol as number of vertices
            //int numEdges = Integer.parseInt(arr1[1]);
                        
            // Read the lines out of the file and put them in a HashMap by points
            while ((nextLine = reader.readLine()) != null) {
            	String[] verts = nextLine.split(" ");
            	int start = Integer.parseInt(verts[0]);
            	int end = Integer.parseInt(verts[1]);
            	theGraph.addEdge(start, end);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Problem loading graph file: " + filename);
            e.printStackTrace();
        }
	}
}
