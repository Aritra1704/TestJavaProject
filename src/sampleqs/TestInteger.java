package sampleqs;

public class TestInteger {

	public static void main(String[] args) {
		Integer x = new Integer(1);
		Integer y = new Integer(2);
		
		System.out.println("Before x: " + x.intValue() + "; y: " + y.intValue());
		modifyWrappers(x, y);
		System.out.println("After x: " + x.intValue() + "; y: " + y.intValue());
	}

	private static void modifyWrappers(Integer x, Integer y) {
		x = new Integer(5);
		y = new Integer(10);
	}

	
}
