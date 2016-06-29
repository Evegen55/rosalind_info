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
	
	String arrN_str[];
	String arrM_str[];
	String arrOutExpected_str[];
	
	BinarySearchKeySetInSortedArray bsk;
	
	@Before
	public void setUp() throws Exception {
		n = 5;
		m = 6;
		arrN = new int[] {10, 20, 30, 40, 50};
		arrM = new int[] {40, 10, 35, 15, 40, 20};
		arrOutExpected = new int[] {4, 1, -1, -1, 4, 2};
		
		arrN_str = new String[] {"10", "20", "30", "40", "50"};
		arrM_str = new String[] {"40", "10", "35", "15", "40", "20"};
		arrOutExpected_str = new String[] {"4", "1", "-1", "-1", "4", "2"};
	}

	@Test
	public void testCalculateInteger() {
		//fail("Not yet implemented");
		bsk = new BinarySearchKeySetInSortedArray();
		int[] arrout = bsk.calculate(n, m, arrN, arrM);
		assertArrayEquals(arrout, arrOutExpected);
	}
	
	@Test
	public void testCalculateString() {
		//fail("Not yet implemented");
		bsk = new BinarySearchKeySetInSortedArray();
		String[] arrout = bsk.calculateStr(n, m, arrN_str, arrM_str);
		assertArrayEquals(arrout, arrOutExpected_str);
	}

}
