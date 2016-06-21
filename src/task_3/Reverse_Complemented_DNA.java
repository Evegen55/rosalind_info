package task_3;

public class Reverse_Complemented_DNA {
	
	public String complementDNA(String dna) {
		//first step
		String one = dna.replaceAll("A", "T");
		String two = one.replaceAll("C", "G");
		//second step
		String three = dna.replaceAll("T", "A");
		String four = three.replaceAll("G", "C");
		//Step 3
		char[] a = dna.toCharArray();
		char[] b = two.toCharArray();
		char[] c = four.toCharArray();
		char[] empty = new char[dna.length()];
		//Step four
		for (int i = 0; i<dna.length(); i++) {
			if (a[i] != b[i]) {
				empty[i] = b[i];
			} else {
				empty[i] = c[i];
			}
		}
		
		return String.valueOf(empty);
	}
	
	public String reverseDNA(String dna) {
		
		char[] a = dna.toCharArray();
		char[] empty = new char[a.length];
		
		for(int i = 0; i < a.length; i++) {
		    char temp = a[i];
		    empty[i] = a[a.length - i - 1];
		    empty[empty.length - i - 1] = temp;
		}
		return String.valueOf(empty);
	}

}
