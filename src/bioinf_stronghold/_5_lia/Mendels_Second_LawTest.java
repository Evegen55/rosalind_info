package bioinf_stronghold._5_lia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Mendels_Second_LawTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcProbability() {
		Mendels_Second_Law msl = new Mendels_Second_Law();
		double result = msl.calcProbability(2, 1);
		assertTrue(result == 0.684);
	}
	
	@Test
	public void testCalcProbability2() {
		Mendels_Second_Law msl = new Mendels_Second_Law();
		double result = msl.calcExpectedProbability('k', 'e');
		assertTrue(result == 0);
	}
	
	@Test
	public void testCalcProbability3() {
		Mendels_Second_Law msl = new Mendels_Second_Law();
		double result = msl.calcExpectedProbability('c', 'c');
		assertTrue(result == 0.25);
	}

}
