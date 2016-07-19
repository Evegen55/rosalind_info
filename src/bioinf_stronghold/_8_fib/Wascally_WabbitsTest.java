package bioinf_stronghold._8_fib;

import static org.junit.Assert.*;

import org.junit.Test;

public class Wascally_WabbitsTest {
	
	private Wascally_Wabbits ww;

	@Test
	public void testNumOfPairs() {
		//fail("Not yet implemented"); // TODO
		ww = new Wascally_Wabbits();
		int result = ww.numOfPairs(5, 3);
		assertTrue(result == 19);
		
	}

}
