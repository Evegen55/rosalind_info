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
	public int numOfPairs(int n, int k){
		return 0;
	}
	
	public int fib4(int n) {
		if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 4;
	   else
		  return fib4(n - 1) + fib4(n - 2);
	}
	
	public static void main(String[] args) {
		Wascally_Wabbits fb = new Wascally_Wabbits();
		System.out.println(fb.fib4(3));
	}

}
