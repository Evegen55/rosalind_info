package bioinf_stronghold._12_lcsm;

import bioinf_stronghold._6_gc.FileReaderMy;

public class FindingSharedMotif {
	public void resolve(String filename){
		FileReaderMy.getMapFromFile(filename)
			.entrySet()
			.stream()
			.forEach(System.out::println);
	}
}
