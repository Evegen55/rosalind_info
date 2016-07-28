package bioinf_stronghold._10_subs;

public class FindingMotifInDNA {
	public void resolver(String one, String two) {
		int lengthOne = one.length();
		int lengthTwo = two.length();
		for (int i=0; i<lengthOne; i++) {
			String s = one.substring(i, lengthTwo+i);
			if(s.equals(two)) {
				System.out.print(i+1 + " ");
			}
		}		
	}
}
