package task_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Reverse_Complemented_DNATest {
	Reverse_Complemented_DNA rc;
	String dnaExample = "AAAACCCGGT";
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testComplementDNA() {
		rc = new Reverse_Complemented_DNA();
		String compldna = rc.complementDNA(dnaExample);
		String trueCompDna = "TTTTGGGCCA";
		assertEquals(compldna, trueCompDna);
		
	}

	@Test
	public void testReverseDNA() {
		rc = new Reverse_Complemented_DNA();
		String revdna = rc.reverseDNA(dnaExample);
		String trueRevDna = "ACCGGGTTTT";
		assertEquals(revdna, trueRevDna);
	}

}
