package algorithmic_heights.deg;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SimpleGraphTest {
	SimpleGraph lst;

	@Test
	@Ignore
	public void testGetNumVertices() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetNumEdges() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testAddVertex() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testAddEdge() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testDegreeSequence() {
		fail("Not yet implemented");
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
