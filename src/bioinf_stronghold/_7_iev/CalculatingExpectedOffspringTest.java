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
	
	@Test
	public void testCalulate1() {
		//fail("Not yet implemented");
		CalculatingExpectedOffspring cl = new CalculatingExpectedOffspring();
		double pr = cl.calulate(18198, 18275, 17577, 18451, 16264, 16186);
		assertTrue(pr == 152040.5);
		//uncomment if it needs
		//System.out.println(pr);
	}

}
