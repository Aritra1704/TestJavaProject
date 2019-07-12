package sampleqs;

import java.util.ArrayList;

public class WordLadder {

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		ArrayList<String> dict = new ArrayList<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		
		// Add the end to the dict
//		dict.add(end);
		
		ArrayList<String> ladder = new ArrayList<>();
		ladder.add(start);
		
		boolean isSame = start.equals(end);
		do {
			String select = findNextStep(ladder, dict, end);
			ladder.add(select);
			isSame = select.equals(end);
		} while(!isSame);
		
		
		System.out.println("\n");
		ladder.forEach(step -> System.out.print(step + " -> "));
	}
	
	// Compares all the dict words with the last ladder step
	private static String findNextStep(ArrayList<String> ladder, ArrayList<String> dict, String end) {
		String currentStep = ladder.get(ladder.size() - 1);
		int min = 100000;
		int select = 0;
		for(int i = 0; i < dict.size(); i++) {
			if(!ladder.contains(dict.get(i))) {
				int compare = stringCompare(currentStep, dict.get(i));
				if(compare < min) {
					min = compare;
					select = i;
				}
			}
		}
		int compare = stringCompare(currentStep, end);
		String result = dict.get(select);
		if(compare <= min)
			result = end;
		return result;
	}

	// This method compares all characters between two strings 
    public static int stringCompare(String str1, String str2)  { 
        int result = 0;
        if(str1.equals(str2))
        	result = 0;
        else {
        	for(char ch : str1.toCharArray()) {
        		if(!str2.contains(ch + ""))
        			result++;
        	}
        }
        
        return result;
    } 
}
