package bioinf_stronghold._7_iev;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatingExpectedOffspringTest {

	@Test
	public void testCalulate() {
		//fail("Not yet implemented");
		CalculatingExpectedOffspring cl = new CalculatingExpectedOffspring();
		double pr = cl.calulate(1, 0, 0, 1, 0, 1);
		assertTrue(pr == 3.5);
	}

}
