package bioinf_stronghold._6_gc;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class IdentifyingUnknownDNAQuicklyTest {
	IdentifyingUnknownDNAQuickly idud;
	
	@Test
	public void test() {
		String filename = "src/bioinf_stronghold/_6_gc/simple_dataset_for_gc.txt";
		idud = new IdentifyingUnknownDNAQuickly(filename);
		double percentage  = idud.getPercent();
		String expected = idud.getLabel();
		assertEquals(expected, "Rosalind_0808");
		assertTrue(percentage == 60.919540);
	}
	
	@Test
	public void test1() {
		String filename = "src/bioinf_stronghold/_6_gc/rosalind_gc.txt";
		idud = new IdentifyingUnknownDNAQuickly(filename);
		double percentage  = idud.getPercent();
		String expected = idud.getLabel();
		assertEquals(expected, "Rosalind_4241");
		assertTrue(percentage == 51.651652);
		
		//optional
		//System.out.println(expected);
		//System.out.println(percentage);
	}

}
