
package bioinf_stronghold._12_lcsm;

import java.io.FileOutputStream;
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
		int i = 0;
		
		long start = System.nanoTime();
		//for (String str : list) {
		//	writePossibleStringsList(str, "src/bioinf_stronghold/_12_lcsm/tempfiles/temp_" + i);
		//	i++;
		//}
		writePossibleStringsList(list.get(0), "src/bioinf_stronghold/_12_lcsm/tempfiles/temp_" + i);
		long end = System.nanoTime();
		double estTime = ((end-start)/(Math.pow(10, 9)));
        double finalValue = Math.round( estTime * 1000.0 ) / 1000.0;
        System.out.print(finalValue + "\t");
		
	}

	/**
	* 
	* @param shortest
	* @return list of all possible variants of substrings
	*/
	private void writePossibleStringsList(String shortest, String filename) {
		int lengts = shortest.length();
		String s = null;
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
}

