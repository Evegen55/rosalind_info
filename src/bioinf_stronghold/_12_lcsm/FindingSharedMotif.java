package bioinf_stronghold._12_lcsm;

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
		HashMap<String, String> map = FileReaderMy.getMapFromFile(filename);
		//print it
		//map.entrySet()
		//.stream()
		//.forEach(System.out::println);
		
		//create a list with only DNA - strings
		List<String> list = map.entrySet().stream()
		.map(e -> e.getValue())
		.collect(Collectors.toList());
		//print it
		//list.stream().forEach(System.out::println);
		
		//sort and print it
		//Collections.sort(list);
		//list.stream().forEach(System.out::println);
		
		//print lengts of a dna
		//list.stream().map(s -> s.length()).forEach(System.out::println);
		//System.out.println();
		//collect all posible variants in a map
		Map<String, List<String>> mapOfLists = new HashMap<>();
		for (String str : list) {
			mapOfLists.put(str, buildPossibleStringsList(str));
		}
		//print it
		mapOfLists.entrySet()
		.stream()
		.forEach(System.out::println);
		
		
	}

	/**
	 * @param shortest
	 */
	private void buildPossibleStringsMap(String shortest) {
		HashMap<String, Integer> mapStr = new HashMap<String, Integer>();
		int lengts = shortest.length();
		for (int i = lengts; i>=0; i--) {
			for (int k = 0; k<i; k++) {
				String s = shortest.substring(k, i);
				if (!mapStr.containsKey(s)) {
					mapStr.put(s, 1);
				} else {
					mapStr.put(s, mapStr.get(s)+1);
				}
			}
		}
		//print it
		mapStr.entrySet()
		.stream()
		.forEach(System.out::println);
	}
	
	/**
	 * 
	 * @param shortest
	 * @return list of all possible variants of substrings
	 */
	private List<String> buildPossibleStringsList(String shortest) {
		List<String> listStr = new ArrayList<String>();
		int lengts = shortest.length();
		for (int i = lengts; i>=0; i--) {
			for (int k = 0; k<i; k++) {
				String s = shortest.substring(k, i);
				if (!listStr.contains(s) && s.length()>1) {
					listStr.add(s);
				}
			}
		}
		//print it
		//listStr
		//.stream()
		//.forEach(System.out::println);
		//and return
		return listStr;
	}
}
