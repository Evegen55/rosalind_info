/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package from_duke_edu;

//import edu.duke.FileResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.duke.FileResource;

/**
 *
 * @author Lartsev
 */
public class CountDNA {
    private HashMap<String, Integer> recordsCopy;
    private ArrayList<String> codonsList;
    private String folder;
    private String fileName;
    
    
    public CountDNA() {
        recordsCopy = new HashMap<>();
        codonsList = new ArrayList<>();
        folder = "data/";
        fileName = "smalldna.txt";
        fileName = "dnaMystery2";
        }
    /*
    Write a void method named buildCodonMap that has two parameters, an int named
    start and a String named dna . This method will build a new map of codons mapped to
    their counts from the string dna with the reading frame with the position start 
    (a value of 0, 1, or 2). You will call this method several times, so be sure 
    to make your map is empty before building it.
    */
    public void buildCodonMap(int start, String dna) {
       //recordsCopy.clear();
       FileResource fr = new FileResource(folder + fileName);
       int lengthDNAminus = 0;
       for(String word : fr.words()){
           String trim = word.trim();
           int lengthDNA = trim.length();
           if(lengthDNA%3 == 1) {
                lengthDNAminus =  lengthDNA-1-start;                            //System.out.println("legth%3=1"+"\t"+lengthDNA);      
             } else if(lengthDNA%3 == 2) {
                 lengthDNAminus = lengthDNA-2;                                  //System.out.println("legth%3=2"+"\t"+lengthDNA); 
             } else {
                 lengthDNAminus = lengthDNA;                                    //System.out.println("legth%3=0"+"\t"+lengthDNA);
             }
            for (int i = start; i < lengthDNAminus; i=i+3) {
                String codon = trim.substring(i, i+3);
                if(codon.equals(dna)) {
                    if(!recordsCopy.containsKey(codon)) {
                        recordsCopy.put(codon,1);                               //System.out.println(codon);    
                    } else {
                        recordsCopy.put(codon,recordsCopy.get(codon)+1);        //System.out.println(codon + "\t" + recordsCopy.get(codon)); 
                    }
                }
            }
        }
    } 
    
    /*
    Write a method named getMostCommonCodon that has no parameters. This method
    returns a String, the codon in a reading frame that has the largest count. 
    If there are several such codons, return any one of them. This method assumes 
    he HashMap of codons to counts has already been built.
    */
    public String getMostCommonCodon() {
        Map.Entry<String,Integer> maxEntry = null;
        for(Map.Entry<String,Integer> entry : recordsCopy.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        //System.out.println(maxEntry.getKey() + "\t" +maxEntry.getValue());
        return maxEntry.getKey();
        
    }
    /*
    Write a void method named printCodonCounts that has two int parameters, start and
    end . This method prints all the codons in the HashMap along with their counts if their
    count is between start and end , inclusive.
    */
    public void printCodonCounts(int start, int end) {
        for(Map.Entry<String,Integer> entry : recordsCopy.entrySet()) {
            String codonCounted = entry.getKey();
            int codonNums = entry.getValue();
            if(codonNums>=start && codonNums<=end) {
                System.out.println(codonCounted + "\t" + codonNums);
            }
            
        }
        
    }
    public ArrayList<String> buildCodonList(int start) {
       codonsList.clear();
       FileResource fr = new FileResource(folder + fileName);
       int lengthDNAminus = 0;
       for(String word : fr.words()){
           String trim = word.trim();
           int lengthDNA = trim.length();
           if(lengthDNA%3 == 1) {
                lengthDNAminus =  lengthDNA-1-start;                            //System.out.println("legth%3=1"+"\t"+lengthDNA);      
             } else if(lengthDNA%3 == 2) {
                 lengthDNAminus = lengthDNA-2;                                  //System.out.println("legth%3=2"+"\t"+lengthDNA); 
             } else {
                 lengthDNAminus = lengthDNA;                                    //System.out.println("legth%3=0"+"\t"+lengthDNA);
             }
            for (int i = start; i < lengthDNAminus; i=i+3) {
                String codon = trim.substring(i, i+3);
                
                    if(!codonsList.contains(codon)) {
                        codonsList.add(codon);                                  //System.out.println(codon);    
                    } 
            }
        }
       return codonsList;
    }
    public HashMap<String, Integer> getMapCodons() {
        return recordsCopy;
    }
    
    public static void main(String[] args) {
    	CountDNA cdna = new CountDNA();
        for(int i = 0; i<3; i++) {
            System.out.println("Reading frame starting with " + i);
            ArrayList<String> buildCodonList = cdna.buildCodonList(i);
            for (String dna : buildCodonList) {
                cdna.buildCodonMap(i, dna);
            }
            cdna.printCodonCounts(0, 1000);
            System.out.println("The most common codon is"+ "\t" + cdna.getMostCommonCodon() + "\n");
            cdna.getMapCodons().clear();
        }
    }
}
