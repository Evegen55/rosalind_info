/**
 * 
 */
package task_4;

/**
 * @author Evegen
 *
 */
public class MendelianInheritance {

	/*
	 * Given: Three positive integers k, m, and n, representing a population 
	 * containing k+m+n organisms: 
	 * k individuals are homozygous dominant for a factor, 
	 * m are heterozygous, and 
	 * n are homozygous recessive.
	 * 
	 * Return: The probability that two randomly selected mating organisms 
	 * will produce an individual possessing a dominant allele 
	 * (and thus displaying the dominant phenotype). 
	 * Assume that any two organisms can mate.
	 */
	public double calculateProbability(int a, int b, int c) {
		double k = a;
		double m = b;
		double n = c;
		
		double P1 = m/(k+m+n);
		double P2 = m/(2*m);
		double P3 = (m-1)/(k+m+n-1);
		double P4 = (k+n)/(k+m+n-1);
		double P5 = k/(k+n);
		double P6 = n/(k+n);
		double P7 = (k+n)/(k+m+n);
		double P8 = m/(k+m+n-1);
		double P9 = (k+n-1)/(k+m+n-1);
		double P10 = (k-1)/(k+n-1);
		double P11 = n/(k+n-1);
		double P12 = k/(k+n-1);
		
		//Probabilities for branches with aA
		double Pr1 = P1*P2*P3*P2;
		double Pr2 = P1*P2*P3*P2;
		double Pr3 = P1*P2*P4*P5;
		double Pr4 = P1*P2*P4*P6;
		double Pr5 = P1*P2*P3*P2;
		double Pr6 = P1*P2*P4*P5;
		double Pr7 = P7*P5*P8*P2;
		double Pr8 = P7*P5*P8*P2;
		double Pr9 = P7*P5*P9*P10;
		double Pr10 = P7*P5*P9*P11;
		double Pr11 = P7*P6*P8*P2;
		double Pr12 = P7*P6*P9*P12;
		
		double sum = Pr1+Pr2+Pr3+Pr4+Pr5+Pr6+Pr7+Pr8+Pr9+Pr10+Pr11+Pr12;
		double finalValue = Math.round( sum * 100000.0 ) / 100000.0;
		
		//for unknown result use this
		System.out.println(finalValue);
		
		return finalValue;
	}
}
