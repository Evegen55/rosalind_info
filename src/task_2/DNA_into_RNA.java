/**
 * 
 */
package task_2;

/**
 * @author Evegen
 *
 */
public class DNA_into_RNA {
	
	/**
	 * Problem: 
	 * An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.
	 * Given a DNA string t corresponding to a coding strand, 
	 * its transcribed RNA string u is formed by replacing all occurrences of 'T' in t with 'U' in u.
	 * Given: A DNA string t having length at most 1000 nt.
	 * Return: The transcribed RNA string of tt.
	 * 
	 * @param dna
	 * @return rna
	 */
	public String translateToRNA(String dna) {
		return dna.replaceAll("T", "U");
	}
	

}
