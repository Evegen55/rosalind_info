package bioinf_stronghold._9_fibd;

import static org.junit.Assert.*;

import org.junit.Test;

public class Wascally_Wabbits_MortalTest {
	
	private Wascally_Wabbits_Mortal ww;

	@Test
	public void testNumOfPairs1() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits_Mortal();
		double result = ww.numOfPairs(1, 3);
		assertTrue(result == 1);
	}
	
	@Test
	public void testNumOfPairs2() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits_Mortal();
		double result = ww.numOfPairs(2, 3);
		assertTrue(result == 1);
	}
	
	@Test
	public void testNumOfPairs3() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits_Mortal();
		double result = ww.numOfPairs(3, 3);
		assertTrue(result == 2);
	}
	
	@Test
	public void testNumOfPairs4() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits_Mortal();
		double result = ww.numOfPairs(4, 3);
		assertTrue(result == 2);
	}
	
	@Test
	public void testNumOfPairs5() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits_Mortal();
		double result = ww.numOfPairs(5, 3);
		assertTrue(result == 3);
	}
	
	@Test
	public void testNumOfPairs6() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits_Mortal();
		double result = ww.numOfPairs(6, 3);
		assertTrue(result == 4);
	}

}
