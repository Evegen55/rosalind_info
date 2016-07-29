/**
 * 
 */
package bioinf_stronghold._10_subs;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

/**
 * @author student
 *
 */
public class FindMotifInDNATest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		FindingMotifInDNA fmd = new FindingMotifInDNA();
		String one = "GATATATGCATATACTT";
		String two = "ATAT";
		String itog = "2 4 10";
		fmd.resolver(one, two);
	}
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		FindingMotifInDNA fmd = new FindingMotifInDNA();
		String one = "GGACGGCGGATGGGCGGATGGCGGATTTGGCGGATTCATAGGGCATGGGAAAAGTGAATTAGTGGCGGATAATGGCGGATGGCGGATGGGCGGATCACAGTGGGATGATGGGCGGATGGTCCGGGCGGATAATGGCGGATTAGCATAGGCGGATCAGGCGGATAGGCGGATGGCGGATGGCGGATAGGGCGGATCGGCGGATGGCGGATCGGCGGATCGAGGCGGATGCGAATCTCTAGGTTGGCGGATGGCGGATGGTGTGGCGGATGGCGGATTTGATAGGCGGATGCTGGCGGATGGCGGATGGCGGATGGCGGATGTCTGGCGGATAGGGGCGGATGGCGGATACGGCGGATGAGGCGGATGGCGGATGGCGGATCTCAGGTGGCGGATGAGCACGCCTGGGGGCGGATTGTGAGGCGGATCGGGGGTCGGCGGATTCGGGCGGATGGCGGATAGGCGGATCATAGTTTGGCGGATGGCGGATGTAGTGGCGGCGGATTGGCGGATGGCGGATCCGGCGGATGTCGGCGGATTCGGCGGATAGGGCGGATGGCGGATAGAAAGCCCCGCTGGCGGATTGAGGCGGATTGTCGGCGGATTGCAATCGGTCCGGCGGATTGGCGGATTGGCGGATGGCGGATTCGAAGGCGGATTGGCGGATGGGCGGATCAAGGCGGATTCGACGGCGGATAGGCGGATCCACTACGGCCGCACAACGGCGGATAGGCGGATGGGGCGGATGGCGGATTCCGAATGGCGGATAGGCGGATAGCTGGCGGATCAGGGCGGATAGGCGGATGGCTGGCGGATGCTGGCGGATCGTCGGCGGAT";
		String two = "GGCGGATGG";
		fmd.resolver(one, two);
	}

}