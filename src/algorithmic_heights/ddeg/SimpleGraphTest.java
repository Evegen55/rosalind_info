package algorithmic_heights.ddeg;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

import algorithmic_heights.deg.GraphLoader;
import algorithmic_heights.deg.SimpleGraph;

public class SimpleGraphTest {
	SimpleGraph lst;

	@Test
	public void testGetNumVertices() {
		lst = new SimpleGraph();
		String file = "data/test_data" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		assertTrue(lst.getNumVertices() == 5);
	}

	@Test
	public void testGetNumEdges() {
		lst = new SimpleGraph();
		String file = "data/test_data" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		assertTrue(lst.getNumEdges() == 4);
	}

	@Test
	public void testDoubleDegreeSequenceWithData() {
		lst = new SimpleGraph();
		String file = "data/test_data" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		List<Integer> corr = readCorrect(file + ".degrees");
		List<Integer> result = lst.DoubleDegreeSequence();
		assertThat(corr, is(result));
	}
	
	@Test
	public void testDegreeSequenceWithRealData() {
		lst = new SimpleGraph();
		String file = "data/rosalind_ddeg" + ".txt";
		GraphLoader.loadSimpleGraph(file, lst);
		List<Integer> corr = readCorrect(file + ".degrees");
		List<Integer> result = lst.DoubleDegreeSequence();
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
