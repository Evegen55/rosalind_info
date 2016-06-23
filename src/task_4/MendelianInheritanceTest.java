package task_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MendelianInheritanceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateProbability() {
		MendelianInheritance mi = new MendelianInheritance();
		int a = 2;
		int b = 2;
		int c = 2;
		
		double sampleOutput = 0.78333;
		double probability = mi.calculateProbability(a, b, c);
		assertTrue(probability == sampleOutput);
	}
	
	@Test
	public void testCalculateProbability1() {
		MendelianInheritance mi = new MendelianInheritance();
		int a = 15;
		int b = 15;
		int c = 23;
		
		double sampleOutput = 0.67217;
		double probability = mi.calculateProbability(a, b, c);
		assertTrue(probability == sampleOutput);
	}

}
