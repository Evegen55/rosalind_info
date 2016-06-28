package algorithmic_heights.bins;

public class BinarySearchKeySetInSortedArray {

	public int[] calculate(int n, int m, int[] arrN, int[] arrM) {
		//loop through unsorted array, get a key
		for (int i = 0; i < m; i++) {
			//System.out.println(arrM[i]);
			int x = arrM[i];
			// find a key in a sorted array
			if (binarySearch(x, arrN)) {
				System.out.println(arrN[i]);
			} else {
				System.out.println(-1);
			}
		}
		return null;
	}
	/**
	 * 
	 * @param args
	 */
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	private boolean binarySearch(int x, int[] arrN) {
		// TODO Auto-generated method stub
		return false;
	}

	//}

}
