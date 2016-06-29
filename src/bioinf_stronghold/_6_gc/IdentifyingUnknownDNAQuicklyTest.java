package bioinf_stronghold._6_gc;

import static org.junit.Assert.*;

import org.junit.Test;

public class IdentifyingUnknownDNAQuicklyTest {
	IdentifyingUnknownDNAQuickly idud;
	
	@Test
	public void test() {
		idud = new IdentifyingUnknownDNAQuickly();
		String expected = idud.getLabelFasta();
		double percentage  = idud.getPercentageFasta();
		assertEquals(expected, "Rosalind_0808");
		assertTrue(percentage == 60.919540);
	}
	
	@Test
	public void test1() {
		idud = new IdentifyingUnknownDNAQuickly();
		String expected = idud.getLabelFasta();
		double percentage  = idud.getPercentageFasta();
		System.out.println(expected);
		System.out.println(percentage);
	}

}
