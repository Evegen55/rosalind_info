/**
 * 
 */
package bioinf_stronghold._6_gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import bioinf_stronghold._1_dna.NucleCount;

/**
 * @author Evegen
 *
 */
public class IdentifyingUnknownDNAQuickly {
	
	private HashMap<String,String> FastaDNAMap;
	private HashMap<String,Double> mapPerc;
	private String filename = "";
	private double percent = 0.0;
	private String label = "";
	
	public IdentifyingUnknownDNAQuickly(String filename) {
		this.filename = filename;
		FastaDNAMap = FileReaderMy.getMapFromFile(filename);
		mapPerc = new HashMap<String,Double>();
		
		//working with file, find and set percent and label
		readAndCalculate();
		CalcPercentageFasta();
		CalcLabelFasta();
	}
	
	/**
	 * 
	 */
	private void readAndCalculate() {
		for (Entry<String, String> seq_with_label : FastaDNAMap.entrySet()) {
			String label = seq_with_label.getKey();
			String seq_for_count = seq_with_label.getValue();
			
			//getting a list of A, C, T, G
			NucleCount nc = new NucleCount();
			nc.countLetters(seq_for_count);
			HashMap<Character, Integer> mapACTG = nc.getMap();
			
			//int for all ACTG inside loop
			int all = 0;
			
			//int for numbers of all 
			int countSumACTG = 0;
			for (Entry<Character, Integer> entry : mapACTG.entrySet()) {
				int count = entry.getValue();
				countSumACTG = countSumACTG + count;
			}

			all = countSumACTG;
			countSumACTG = 0;
			
			//int for sum of C andG
			int countSum_C_G = 0;
			
			//int for numbers of C
			int countSumC = 0;
			for (Entry<Character, Integer> entry : mapACTG.entrySet()) {
				if(entry.getKey() == 'C') {
					int count = entry.getValue();
				countSumC = countSumC + count;
				}
				
			}

			countSum_C_G = countSum_C_G + countSumC;
			countSumC = 0;
			
			//int for numbers of G
			int countSumG = 0;
			for (Entry<Character, Integer> entry : mapACTG.entrySet()) {
				if(entry.getKey() == 'G') {
					int count = entry.getValue();
				countSumG = countSumG + count;
				}
				
			}
			//System.out.println(label + " ===========G " + countSumG);
			countSum_C_G = countSum_C_G + countSumG;
			countSumG = 0;
			
			double percentage = (double)countSum_C_G / (double) all;
			
			mapPerc.put(label, percentage);
			
		}
	}

	/**
	 * DO IT FIRST!!!
	 * 
	 */
	private void CalcPercentageFasta() {
		double percentage = 0;
		for(Entry<String,Double> entry : mapPerc.entrySet()) {
			double val = entry.getValue();
			if (val>percentage){
				percentage = val;
			}
		}
		//BECAUSE IT CALCULATES PRIVATE FIELD
		percent = percentage;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getPercent() {
		double percentage = percent * 100.0;
		double itogo = Math.round( percentage * 1000000.0 ) / 1000000.0;
		return itogo;
	}

	/**
	 * Loop through map and find a label
	 * 
	 */
	private void CalcLabelFasta() {
		for(Entry<String,Double> entry : mapPerc.entrySet()) {
			double val = entry.getValue();
			if (val == percent){
				label = entry.getKey();
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getLabel() {
		return label;
	}
	
	

}
