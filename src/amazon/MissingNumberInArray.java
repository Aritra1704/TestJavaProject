package amazon;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11};
		int N = 11;
		
		// Iterative approach
		for(int i = 1; i <= arr.length; i++) {
			if(i != arr[i-1]) {
				System.out.println("Result >> " + i);
				break;
			}
		}

		// Sum approach
		int idealSum = N * (N + 1) / 2;
		int actualSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != arr[i]) {
				actualSum += arr[i];
			}
		}
		System.out.println("Result >> " + (idealSum - actualSum));
		
		// Binary search approach
		System.out.println(bsSearch(arr, 0, N - 1));
	}
	
	static int bsSearch(int[] arr, int start, int end) {
		if(start > end) {
			return (arr[start] + arr[end]) / 2;
		}
		
		int middle = (start + end) / 2;
		if((middle + 1) == arr[middle]) {
			return bsSearch(arr, middle + 1, end);
		} else {
			return bsSearch(arr, start, middle - 1);
		}
	}

}
