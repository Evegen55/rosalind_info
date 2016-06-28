package algorithmic_heights.bins;

public class BinarySearchKeySetInSortedArray {

	public int[] calculate(int n, int m, int[] arrN, int[] arrM) {
		int[] appOut = new int[m];
		//loop through unsorted array, get a key
		for (int i = 0; i < m; i++) {
			//System.out.println(arrM[i]);
			int x = arrM[i];
			// find a key in a sorted array
			int pos = binarySearch(x, arrN); 
			if (pos < n) {
				System.out.println(pos+1);
				appOut[i] = pos+1;
			} else {
				appOut[i] = -1;
				System.out.println(-1);
			}
		}
		return appOut;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	}

	private int binarySearch(int x, int[] arrN) {
		//System.out.println("recursive " + (recFind(x, 0, arrN.length-1, arrN)+1));
		return recFind(x, 0, arrN.length-1, arrN);
	}
	
	private int recFind(int searchKey, int lowerBound, int upperBound, int[] arrN) {
		
		int curIn = (lowerBound + upperBound ) / 2;
		
        if(arrN[curIn]==searchKey) {
            return curIn;              // found it
        } else if(lowerBound > upperBound) {
            return arrN.length;             // can't find it
            // divide range
        } else {
            // it's in upper half
            if(arrN[curIn] < searchKey) {
                return recFind(searchKey, curIn+1, upperBound, arrN);
                // it's in lower half
            } else {
                return recFind(searchKey, lowerBound, curIn-1, arrN);
            }                      
        }
		
	}

	//}

}
