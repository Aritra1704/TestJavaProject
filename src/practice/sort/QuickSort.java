package practice.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] myarray = new int[] { 9, 8, 5, 20, 56, 1, 2, 76, 23};
		
		quickSort(myarray, 0, myarray.length - 1);
		
		System.out.print(Arrays.toString(myarray));

	}
	
	private static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = end;
		
		int i = start - 1;
		for(int j = start; j < end; j++) {
			if(arr[j] < arr[pivot]) {
				swap(arr, ++i, j);
			}
		}
		swap(arr, ++i, pivot);
		
		return i;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
