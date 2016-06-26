package bioinf_stronghold._2_rna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DNA_into_RNATest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTranslateToRNA() {
		DNA_into_RNA tr = new DNA_into_RNA();
		String dna = "GATGGAACTTGACTACGTAAATT";
		String rna = "GAUGGAACUUGACUACGUAAAUU";
		assertEquals(rna, tr.translateToRNA(dna));
	}

}
