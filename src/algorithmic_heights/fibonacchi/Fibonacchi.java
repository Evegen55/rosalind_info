package algorithmic_heights.fibonacchi;

public class Fibonacchi {

	/**
	 * 
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		Fibonacchi fb = new Fibonacchi();
		System.out.println(fb.fib(21));
	}

}
