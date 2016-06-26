package bioinf_stronghold._5_lia;

/**
 * 
 * @author Evegen
 *
 */
public class Mendels_Second_Law {
	
	/*
	 * Given: Two positive integers k (k≤7) and N (N≤2^k). 
	 * In this problem, we begin with Tom, who in the 0th generation has genotype AaBb. 
	 * Tom has two children in the 1st generation, each of whom has two children, and so on. 
	 * Each organism always mates with an organism having genotype AaBb.
	 * 
	 * Return: The probability that at least N AaBb organisms will belong to 
	 * the k-th generation of Tom's family tree (don't count the AaBb mates at each level). 
	 * Assume that Mendel's second law holds for the factors.
	 * 
	 */
	/**
	 * The key for solving this problem is use a THREE-abstract data type!
	 * Where k - is a tree level
	 * N - is a amount of leaves of a tree
	 * 
	 * @param k
	 * @param N
	 * @return
	 */
	public double calcProbability(int k, int N) {
		double probability = 0;
		
		char[] children = new char[]{'c','d','e','f','g','h','k','l','m'};
		double childrenPr = 0;
		double childrenPrG = 0;
		
		//all children of parent AaBb
		for (char t : children) {
			double ch1 = calcExpectedProbability('g', t);
			double ch2 = calcExpectedProbability(t, 'g');
			//System.out.println(ch1);
			//System.out.println("ch2 " + ch2);
			childrenPrG = ch1 * ch2;
			System.out.println(childrenPrG);
			childrenPr = childrenPr + childrenPrG;
			System.out.println("childrenPr " + childrenPr);
		}
		
		//System.out.println(childrenPr);
		
		return Math.round( probability * 100.0 ) / 100.0;
	}
	
	/**
	 * henotype of second parent is always AaBb
	 * 
	 * proxy for henotypes:
	 *  - AABB - char c
	 *  - AABb - char d
	 *  - AAbb - char e
	 *  - AaBB - char f
	 *  - AaBb - char g
	 *  - Aabb - char h
	 *  - aaBB - char k
	 *  - aaBb - char l
	 *  - aabb - char m  
	 * @param henotypeParent1
	 * @param henotypeChildrenExpected
	 * @return probability of children with expected henotype as it described in Mendel's Second Law
	 */
	public double calcExpectedProbability(char henotypeParent1, char henotypeChildrenExpected) {
		double probability = 0;
		
		//for henotype of first parent AABB
		if (henotypeParent1 == 'c') {
			if (henotypeChildrenExpected == 'c' || 
					henotypeChildrenExpected == 'd' ||
					henotypeChildrenExpected == 'g' || 
					henotypeChildrenExpected == 'l') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
			
		//for henotype of first parent AABb	
		} else if (henotypeParent1 == 'd') {
			if (henotypeChildrenExpected == 'c' || 
					henotypeChildrenExpected == 'e' ||
					henotypeChildrenExpected == 'f' || 
					henotypeChildrenExpected == 'h') {
				probability = 1.0/8.0;
			} else if (henotypeChildrenExpected == 'd' || 
					henotypeChildrenExpected == 'g') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
			
		//for henotype of first parent AAbb	
		} else if (henotypeParent1 == 'e') {
			if (henotypeChildrenExpected == 'c' ||
					henotypeChildrenExpected == 'd' ||
					henotypeChildrenExpected == 'g' || 
					henotypeChildrenExpected == 'l') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
					
		//for henotype of first parent AaBB	
		} else if (henotypeParent1 == 'f') {
			if (henotypeChildrenExpected == 'c' || 
					henotypeChildrenExpected == 'd' ||
					henotypeChildrenExpected == 'k' || 
					henotypeChildrenExpected == 'l') {
				probability = 1.0/8.0;
			} else if (henotypeChildrenExpected == 'f' || 
					henotypeChildrenExpected == 'g') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
		
			
		//for henotype of first parent AaBb	
		} else if (henotypeParent1 == 'g') {	
			if (henotypeChildrenExpected == 'c' || 
					henotypeChildrenExpected == 'e' ||
					henotypeChildrenExpected == 'k' || 
					henotypeChildrenExpected == 'm') {
				probability = 1.0/16.0;
			} else if (henotypeChildrenExpected == 'd' || 
					henotypeChildrenExpected == 'f' ||
					henotypeChildrenExpected == 'h' ||
					henotypeChildrenExpected == 'l' ) {
				probability = 1.0/8.0;
			} else if (henotypeChildrenExpected == 'g') {
				probability = 1.0/4.0;
			}else {
				probability = 0;
			}
			
		//for henotype of first parent Aabb	
		} else if (henotypeParent1 == 'h') {
			if (henotypeChildrenExpected == 'd' || 
					henotypeChildrenExpected == 'e' ||
					henotypeChildrenExpected == 'l' || 
					henotypeChildrenExpected == 'm') {
				probability = 1.0/8.0;
			} else if (henotypeChildrenExpected == 'g' || 
					henotypeChildrenExpected == 'h') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
			
		//for henotype of first parent aaBB	
		} else if (henotypeParent1 == 'k') {
			if (henotypeChildrenExpected == 'f' ||
					henotypeChildrenExpected == 'g' ||
					henotypeChildrenExpected == 'k' || 
					henotypeChildrenExpected == 'l') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
					
		//for henotype of first parent aaBb	
		} else if (henotypeParent1 == 'l') {
			if (henotypeChildrenExpected == 'f' || 
					henotypeChildrenExpected == 'k' ||
					henotypeChildrenExpected == 'h' || 
					henotypeChildrenExpected == 'm') {
				probability = 1.0/8.0;
			} else if (henotypeChildrenExpected == 'g' || 
					henotypeChildrenExpected == 'l') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
			
		//for henotype of first parent aabb	
		} else if (henotypeParent1 == 'm') {
			if (henotypeChildrenExpected == 'g' ||
					henotypeChildrenExpected == 'h' ||
					henotypeChildrenExpected == 'l' || 
					henotypeChildrenExpected == 'm') {
				probability = 1.0/4.0;
			} else {
				probability = 0;
			}
					
		//for henotype of first parent aaBb	
		}
		
		return probability;
	}
}
