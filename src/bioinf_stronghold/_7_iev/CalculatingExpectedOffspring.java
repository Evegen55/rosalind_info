/**
 * 
 */
package bioinf_stronghold._7_iev;

/**
 * @author Evegen
 *
 */
public class CalculatingExpectedOffspring {
	
	/**
	 * 
	 * @param a is a number of pairs which type is AA-AA
	 * @param b is a number of pairs which type is AA-Aa
	 * @param c is a number of pairs which type is AA-aa
	 * @param d is a number of pairs which type is Aa-Aa
	 * @param e is a number of pairs which type is Aa-aa
	 * @param f is a number of pairs which type is aa-aa
	 * @return
	 */
	public double calulate(int a, int b, int c, int d, int e, int f) {
		double a_d = (double )a;
		double b_d = (double )b;
		double c_d = (double )c;
		double d_d = (double )d;
		double e_d = (double )e;
		double f_d = (double )f;
		double offspring = 2.0;
		
		double Pr_a_d = 1.0*offspring;
		double Pr_b_d = 1.0*offspring;
		double Pr_c_d = 1.0*offspring;
		double Pr_d_d = (3.0/4.0)*offspring;
		double Pr_e_d = (0.5)*offspring;
		double Pr_f_d = (0)*offspring;
		
		int sum = a+b+c+d+e+f;
		//System.out.println(sum);
		
		return a*Pr_a_d + b*Pr_b_d + c*Pr_c_d + d*Pr_d_d + e*Pr_e_d + f*Pr_f_d;
	}

}
