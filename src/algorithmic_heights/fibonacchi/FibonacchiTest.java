package algorithmic_heights.fibonacchi;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacchiTest {

	@Test
	public void testFib() {
		Fibonacchi fb = new Fibonacchi();
		assertTrue(fb.fib(6) == 8);
	}

}
