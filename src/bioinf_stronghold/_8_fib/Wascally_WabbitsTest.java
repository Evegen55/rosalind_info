package bioinf_stronghold._8_fib;

import static org.junit.Assert.*;

import org.junit.Test;

public class Wascally_WabbitsTest {
	
	private Wascally_Wabbits ww;

	@Test
	public void testNumOfPairs1() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits();
		double result = ww.numOfPairs(1, 3);
		assertTrue(result == 1);
	}
	
	@Test
	public void testNumOfPairs2() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits();
		double result = ww.numOfPairs(2, 3);
		assertTrue(result == 1);
	}
	
	@Test
	public void testNumOfPairs3() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits();
		double result = ww.numOfPairs(3, 3);
		assertTrue(result == 4);
	}
	
	@Test
	public void testNumOfPairs4() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits();
		double result = ww.numOfPairs(4, 3);
		assertTrue(result == 7);
	}
	
	@Test
	public void testNumOfPairs5() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits();
		double result = ww.numOfPairs(5, 3);
		assertTrue(result == 19);
	}

}
