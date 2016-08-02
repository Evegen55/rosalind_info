package bioinf_stronghold._12_lcsm;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;

import bioinf_stronghold._6_gc.FileReaderMy;

public class FindingSharedMotifTest {

	FindingSharedMotif fm;
	
	@Ignore
	@Test
	public void testResolve() {
		//fail("Not yet implemented");
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/rosalind_lcsm.txt";
		fm.resolve(filename);
	}
	@Ignore
	@Test
	public void testfindFirst(){
		String word = "AC";
		String dna = "GATTACA";
		fm = new FindingSharedMotif();
		int i = fm.findFirst(word, dna);
		assertTrue(i == 1);
	}
	@Ignore
	@Test
	public void testFindFirstThrueListOfStrings() {
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/lcsm.txt";
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		String word = "AC";
		boolean bool = fm.findFirstThrueListOfStrings(word, list);
		assertTrue(bool);
	}
	@Ignore
	@Test
	public void testFindFirstThrueListOfStrings1() {
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/lcsm.txt";
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		String word = "ATT";
		boolean bool = fm.findFirstThrueListOfStrings(word, list);
		assertTrue(!bool);
	}
	@Ignore
	@Test
	public void testFindFirstThrueListOfStringsBigList() {
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/rosalind_lcsm.txt";
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		String word = "AC";
		boolean bool = fm.findFirstThrueListOfStrings(word, list);
		assertTrue(bool);
	}
	@Ignore
	@Test
	public void testFindFirstThrueListOfStringsBigListBigWord() {
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/rosalind_lcsm.txt";
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		String word = "CTATAG";
		boolean bool = fm.findFirstThrueListOfStrings(word, list);
		assertTrue(!bool);
	}
	
	@Ignore
	@Test
	public void testFindAllPossibleSmallList(){
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/lcsm.txt";
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		fm.findAllPossible(list);
	}
	
	//@Ignore
	@Test
	public void testFindAllPossibleBiglList(){
		fm = new FindingSharedMotif();
		String filename = "src/bioinf_stronghold/_12_lcsm/rosalind_lcsm.txt";
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		fm.findAllPossible(list);
	}

}
