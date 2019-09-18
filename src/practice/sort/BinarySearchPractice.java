package practice.sort;

public class BinarySearchPractice {

	public static void main(String[] args) {
		int[] testarray = {2, 4, 6, 7, 9, 11, 15, 17, 19, 25, 27, 29, 31};
		int testsearch = 11; 
		int position = binarySearch(testarray, 0, testarray.length - 1, testsearch);
		
		System.out.println("BST recursion: " + position);
	}

	private static int binarySearch(int[] arr, int start, int end, int search) {
		if(start > end) return -1;
		
		int middle = (start + end) / 2;
		if(arr[middle] == search) return middle;
		else if(arr[middle] > search) end = middle - 1;
		else start = middle + 1;
		
		return binarySearch(arr, start, end, search);
	}
}
