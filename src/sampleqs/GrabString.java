package sampleqs;

public class GrabString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Testcase kxyqvnrtys 10
		//testcase daata 7
		
		System.out.println(solution("abccba"));
	}

	private static int solution(String test) {
		int count = 0;
		for(int i = 0; i < test.length(); i++) {
			for (int j = i+1; j <= test.length(); j++ ) {
				if(ispalindrome(test.substring(i, j)))
					count++;
			}
		}
		
		return count;
	}
	
	static boolean ispalindrome(String input) {
		String rev = "";
		
		for(int i = input.length() - 1 ; i >= 0 ; i--) {
			rev += input.charAt(i);
		}
		
		if(input.equalsIgnoreCase(rev)) {
//			System.out.println("input: " + input + " rev: " + rev);
			return true;
		}
			
		return false;
	}
}
