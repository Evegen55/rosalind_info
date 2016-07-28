/**
 * 
 */
package bioinf_stronghold._9_fibd;

/**
 * @author student
 *
 */
public class Wascally_Wabbits_Mortal {
	
	/**
	 * Given: Positive integers
	 * 
	 * @param n<=100 - num of month
	 * @param m<=5
	 * @return The total number of pairs of rabbits that will 
	 * remain after the n-th month if all rabbits live for m months.
	 *         
	 * @see http://rosalind.info/problems/fibd/
	 */
	public double numOfPairs(int n, int m){
		if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	    else if(n < m)
		      return (numOfPairs((n - 1), m) + numOfPairs((n - 2), m));
	    else
		  return (numOfPairs((n - 1), m) + numOfPairs((n - 2), m) - numOfPairs((n - m), m));
	}
	
	
	public static void main(String[] args) {
		Wascally_Wabbits_Mortal fb = new Wascally_Wabbits_Mortal();
		for (int i = 0; i< 15; i++) {
			System.out.println(fb.numOfPairs(i,3));
		}
		System.out.println("jhjk" + fb.numOfPairs(7,3));
	}

}
