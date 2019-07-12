package sampleqs;

public class TestString {

	public static void main(String[] args) {
		String a = "carousell";
		String b = "carousell";
		System.out.println("answer: " + String.valueOf(a==b));
		
		String str1 = "carou";
		String str2 = "sell";
		String str3 = "carousell";
		String str4;
		str4 = str1 + str2;
		
		
		System.out.println("answer: " + String.valueOf(str3 == str4));

	}

}
