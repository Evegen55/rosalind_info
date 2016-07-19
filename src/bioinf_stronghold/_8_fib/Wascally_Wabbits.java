/**
 * 
 */
package bioinf_stronghold._8_fib;

/**
 * @author student
 *
 */
public class Wascally_Wabbits {
	
	/**
	 * Given: Positive integers
	 * 
	 * @param n<=40 - num of month
	 * @param k<=5
	 * @return The total number of rabbit pairs that will be present after n months
	 * 		   if we begin with 1 pair and in each generation, every pair of reproduction-age rabbits 
	 *         produces a litter of k rabbit pairs (instead of only 1 pair).
	 *         
	 * @see http://rosalind.info/problems/fib/
	 */
	public double numOfPairs(int n, int k){
		if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	    else
		  return (numOfPairs((n - 1), k) + numOfPairs((n - 2), k)*k);
	}
	
	
	public static void main(String[] args) {
		Wascally_Wabbits fb = new Wascally_Wabbits();
		for (int i = 0; i< 40; i++) {
			System.out.println(fb.numOfPairs(i,3));
		}
		
	}

}
