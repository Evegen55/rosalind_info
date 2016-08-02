
package bioinf_stronghold._12_lcsm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bioinf_stronghold._6_gc.FileReaderMy;

public class FindingSharedMotif {
	public void resolve(String filename){
		//create a list with only DNA - strings
		List<String> list = FileReaderMy.getMapFromFile(filename)
				.entrySet()
				.stream()
				.map(e -> e.getValue())
				.collect(Collectors.toList());
		//write a map dna-all possible substrings toa temp file
		//long start = System.nanoTime();
		//for (String str : list) {
		//	writePossibleStringsList(str, "src/bioinf_stronghold/_12_lcsm/tempfiles/temp_" + i);
		//	i++;
		//}
		//writePossibleStringsList(list.get(0), "src/bioinf_stronghold/_12_lcsm/tempfiles/temp_" + i);
		//long end = System.nanoTime();
		//double estTime = ((end-start)/(Math.pow(10, 9)));
       // double finalValue = Math.round( estTime * 1000.0 ) / 1000.0;
       // System.out.print(finalValue + "\t");
        
        
       // long start1 = System.nanoTime();
        //printFile("src/bioinf_stronghold/_12_lcsm/tempfiles/temp_0");
      //  long end1 = System.nanoTime();
		//double estTime1 = ((end1-start1)/(Math.pow(10, 9)));
       // double finalValue1 = Math.round( estTime1 * 1000.0 ) / 1000.0;
       // System.out.print(finalValue + "\t");
        
        //list.stream().forEach(System.out::println);
        
	}	

	/**
	 * 
	 * @param shortest
	 * @param filename
	 */
	private void writePossibleStringsList(String shortest, String filename) {
		int lengts = shortest.length();
		try(FileWriter outFile= new FileWriter(filename)) {
			for (int i = lengts; i>=0; i--) {
			for (int k = 0; k<i; k++) {
				outFile.write(shortest.substring(k, i) + "\n");
			}
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param word
	 * @param dna
	 * @return
	 */
	public int findFirst(String word, String dna){
		int wordLength = word.length();
		int dnaLength = dna.length();
		for (int k = 0; k<dnaLength; k++) {
			if(wordLength+k <= dnaLength) {
				String s = dna.substring(k, wordLength+k);
				if(word.equals(s)) {
					//System.out.println(s);
					return 1;
				}
			}
		}
		return 0;
	}
	
	/**
	 * 
	 * @param list
	 */
	public boolean findFirstThrueListOfStrings(String word, List<String> list) {
		int count = 0;
		for(String dna: list) {
			count += findFirst(word, dna);
		}
		if (count == list.size()) return true;
		return false;
	}
	
	/**
	 * 
	 * @param list
	 */
	public void findAllPossible(List<String> list){
		
		int count = 3;
		
		String wordFromList = list.get(0);
		int lengts = wordFromList.length();
		for (int i = lengts; i>=0; i--) {
			for (int k = 0; k<i-count; k++) {
				//String s = ;
				boolean bool = findFirstThrueListOfStrings(wordFromList.substring(k, i), list);
				int newCount = i-k;
				if(bool && newCount>count) {
					count = newCount;
					System.out.println(wordFromList.substring(k, i) + "\t" + count);
				}
			}
		}
	}
}

