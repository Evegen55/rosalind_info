package bioinf_stronghold._1_dna;

import java.util.HashMap;
import java.util.Map;

public class NucleCount {
	
	private HashMap<Character, Integer> map;
	
	public NucleCount() {
		map = new HashMap<>();
	}

	/**
	 * 
	 * @param dna
	 */
	public void countLetters(String dna) {
		for (char s : dna.toCharArray()) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s,map.get(s)+1); 
			}
		}
		
	}
	
	/**
	 * 
	 */
	public void printCodonCounts() {
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
        	Character c = entry.getKey();
            int n = entry.getValue();
            System.out.println(c + "\t" + n);
        }
    }
	
	
	
	public HashMap<Character, Integer> getMap() {
		return map;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		NucleCount nc = new NucleCount();
		nc.countLetters("AGTGGTTCGGGTGAGAGAATGCTGGGCCGTCATGACTATAAAGCCGTCTAGCTAACATGCGTGGTAGAAAACTCAACTCGAGAATGTAAGTGAGAATAACTGTGTCACCTTAACGTCTTCCCGAGCCACACCGAAAGGGAGCCTTGCACTTGGGGCTTCATAGATTACGTTGAAGATGCGGACTCATTCTAGCCCGAGCACTACAAAGTCGGGTTCGGAGCGACGTATTACTTCTACGCGGTTCCTTAACCTAATTGGTCGTGGTCGAGTTCGTGGTAGAATTTTTTTTTATTGAGACCAGCCCGCTCACTGGCGCCGATTGCATGGTCAATGAGGGTATTACACGAGATTCTATATTTGTGTAAGGTTGCCCCTATGTCTGCGATCAGGGCACTGCCCGGGACGAGCTTTCCTGTACCCCGCCGCAGAGTGTACGCGGTCACGCGCCGCGTCTTAGTAGCGTAGAAAAACAAACGATTTCATCAATAAAGGTGTTAGTGTTAATACTCCTAAGGCGTTCTTGAAGGGGAGCGTCTCAAAAGATCCGTGATTCTCGCATTCGTACTCGCAGATCCCGTCTGGGGGCTTCCCCCTGTTTGGAACCTAGAGCGCCCACACAGCGCATTTCAGTGCTATGCTTTTGCGCATGCTTGGTCGCGGTTTCACCTCTTGTAGCGACCCAACATGCCCACTGCGCTGCCCGCAAGCTAGTTAACCAGCCGATGGCGAGTGGAGCTCAAAACTATCTCTTAGGTCCTGATAGGCATTCCTTACTCGGCTAGGAGATGACTTCACACCGCTTCAAGTCCTAATCGGTATCGAGGAGAACTTTCCTGCCCGAACTCTTTA");
		nc.printCodonCounts();
	}

}
