package practice.binarysearch;

public class Algorithm {

	public int lsIteration(int[] array, int search) {

		for(int i = 0; i < array.length; i++) {
			if(array[i] == search)
				return i;
		}
		
		return -1;
	}
	
	public int bsRecursion(int[] array, int search, int start, int end) {
		if(start > end) return -1;
		int middle = (start + end) / 2;
		if(array[middle] == search)
			return middle;
		else if(array[middle] < search)
			start = middle + 1; 
		else
			end = middle - 1;
			
		return bsRecursion(array, search, start, end);
	}
}
