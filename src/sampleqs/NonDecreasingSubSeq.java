package sampleqs;

public class NonDecreasingSubSeq {

	public static void main(String[] args) {
		int[] arr = {5, 12, -3, 6, 12, 5, 18};
		findSubSequence(arr);
	}

	private static void findSubSequence(int[] arr) {
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			int j = i+1;
			int currentVal = arr[i];
			for(;j < arr.length; j++) {
				if(arr[j] >= currentVal) {
					strBuilder.append(arr[j] + " ");
					currentVal = arr[j];
				}
			}
			if(!strBuilder.toString().equalsIgnoreCase("")) {
				System.out.println(arr[i] + " " + strBuilder.toString());
			}
			strBuilder.setLength(0);
		}
		
	}

}
