package sampleqs;

public class Grabtestfoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bar();
	}
	
	static void bar() {
		int a = 3;
		String s = "Blue";
		a = foo(a, s);
		System.out.println("a= " + a + " s= " + s);
	}
	
	static int foo(int a, String s) {
		s = "yellow";
		a = a + 2;
		System.out.println("Inside foo: a= " + a + " s= " + s);
		return a;
	}

}
