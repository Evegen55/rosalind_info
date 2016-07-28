package bioinf_stronghold._11_hamm;

public class CountingPointMutations {
	public void resolver(String one, String two) {
		int count = 0;
		for (int i=0; i<one.length(); i++) {
			if(one.charAt(i) != two.charAt(i)) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
