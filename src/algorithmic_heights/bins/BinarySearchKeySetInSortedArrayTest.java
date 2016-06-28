package algorithmic_heights.bins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchKeySetInSortedArrayTest {

	int n;
	int m;
	int[] arrN;
	int[] arrM;
	int[] arrOutExpected;
	
	@Before
	public void setUp() throws Exception {
		n = 5;
		m = 6;
		arrN = new int[] {10, 20, 30, 40, 50};
		arrM = new int[] {40, 10, 35, 15, 40, 20};
		arrOutExpected = new int[] {4, 1, -1, -1, 4, 2};
	}

	@Test
	public void testCalculate() {
		//fail("Not yet implemented");
		BinarySearchKeySetInSortedArray bsk = new BinarySearchKeySetInSortedArray();
		int[] arrout = bsk.calculate(n, m, arrN, arrM);
		assertEquals(arrout, arrOutExpected);
	}

}
