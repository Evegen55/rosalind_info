package algorithmic_heights.deg;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class SimpleGraphTest {
	SimpleGraph lst;

	@Test
	public void testGetNumVertices() {
		lst = new SimpleGraph();
		String file = "data/SampleDatasetForSimpleGraph" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		assertTrue(lst.getNumVertices() == 6);
	}

	@Test
	public void testGetNumEdges() {
		lst = new SimpleGraph();
		String file = "data/SampleDatasetForSimpleGraph" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		assertTrue(lst.getNumEdges() == 7);
	}

	@Test
	public void testAddVertex() {
		lst = new SimpleGraph();
		lst.addVertex();
		assertTrue(lst.getNumVertices() == 1);
	}

	@Test
	public void testAddEdge() {
		lst = new SimpleGraph();
		lst.addVertex();
		lst.addVertex();
		lst.addEdge(1, 2);
		assertTrue(lst.getNumEdges() == 1);
	}

	@Test
	public void testDegreeSequenceWithData() {
		lst = new SimpleGraph();
		String file = "data/SampleDatasetForSimpleGraph" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		List<Integer> corr = readCorrect(file + ".degrees");
		List<Integer> result = lst.degreeSequence();
		assertThat(corr, is(result));
	}
	
	@Test
	public void testDegreeSequenceWithRealData() {
		lst = new SimpleGraph();
		String file = "data/rosalind_deg" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		List<Integer> corr = readCorrect(file + ".degrees");
		List<Integer> result = lst.degreeSequence();
		assertThat(corr, is(result));
	}

	/**
	 * 
	 * @param file
	 * @return
	 */
	private List<Integer> readCorrect(String file) {
		List<Integer> ret = new ArrayList<Integer>();
		try {
			Scanner s = new Scanner(new File(file));
	        while(s.hasNextInt()) { 
	        	ret.add(s.nextInt());
	        }
	    } catch (Exception e) {
	    	System.out.println("Could not open answer file! Please submit a bug report.");
	    }
	    return ret;
	}

}
