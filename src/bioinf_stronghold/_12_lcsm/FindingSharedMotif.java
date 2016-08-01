
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
        
        
        long start1 = System.nanoTime();
        printFile("src/bioinf_stronghold/_12_lcsm/tempfiles/temp_0");
        long end1 = System.nanoTime();
		double estTime1 = ((end1-start1)/(Math.pow(10, 9)));
        double finalValue1 = Math.round( estTime1 * 1000.0 ) / 1000.0;
        System.out.print(finalValue + "\t");
	}

	private void printFile(String filename) {
		try(FileInputStream inFile = new FileInputStream(filename)) {
			while(inFile.available() > 0) {
				System.out.print("-");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
}

