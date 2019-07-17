package sampleqs;

public class MaxValueWithConstraint {

	// Given and array of integers find the max value of a[i] - a[j] + a[k]. With constraints: i < j < k && a[j] < a[j] < a[k]
	// Simple DP - stored suffixMax
	public static void main(String[] args) {
	
		int[] testCase1 = new int[]{1, 2, 3, 5, 4, 8, 7, 9, 16, 15, 14};
		int result = doCalcu(testCase1);
		System.out.println(result);
	}
	
	private static int doCalcu(int[] numbers) {
		int result = 0;
		
		int i = 0;
		int j = i + 1;
		int k = j + 1;
		for(; k < numbers.length; i++) {
			j = i + 1;
			for(; k < numbers.length; j++) {
				k = j + 1;// To initialise the K count
				for(; k < numbers.length; k++) {
					if(numbers[k] > numbers[j] && numbers[j] > numbers[i]) {
						int calculate = numbers[i] - numbers[j] + numbers[k];
						if(calculate > result)
							result = calculate;
					}
				}
				k = j + 1;// To reset the K count so that it satisfies the loop termination
			}
			j = i + 1;// To reset the J count so that it satisfies the loop termination
			k = j + 1;// To reset the K count so that it satisfies the loop termination
		}
		
		return result;
	}

}
