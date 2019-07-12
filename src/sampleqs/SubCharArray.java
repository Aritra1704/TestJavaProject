package sampleqs;

import java.util.ArrayList;

public class SubCharArray {

	public static void main(String[] args) {
		char[] main = new char[]{'H', 'E', 'L', 'O'};
		char[] test = new char[]{'L', 'O'};
		
		boolean result = findElement(main, test);
		System.out.println(result);

	}
	
	static boolean findElement(char[] main, char[] test) {
		
		boolean isSubArray = false;
		ArrayList<String> arrAlreadyPresent = new ArrayList<String>();
		for(char searchChar : test) {
			String searchStr = Character.toString(searchChar);
			if(!arrAlreadyPresent.contains(searchStr)) {
				for(char charval : main) {
					if(charval == searchChar) {
						arrAlreadyPresent.add(searchStr);
					}
				}	
			} else {
				break;
			}	
		}
		
		if(arrAlreadyPresent.size() == test.length)
			isSubArray = true;
		return isSubArray;
	}

}
