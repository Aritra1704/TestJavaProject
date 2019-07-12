package sampleqs;

public class InheritanceStatic {

	public static int x = 100;
	 public static void main(String args[] ) {
		 InheritanceStatic h1 = new InheritanceStatic();
		 h1.x++;
		 
		 InheritanceStatic h2 = new InheritanceStatic();
		 h2.x++;
		 
		 h1 = new InheritanceStatic();
		 h1.x++;
		 
		 System.out.println("Value of x s 100 >> " + x);
		 
		 Test g1 = new Test();
		 g1.y++;
		 
		 Test g2 = new Test();
		 g2.y++;
		 
		 g1 = new Test();
		 g1.y++;
		 
		 System.out.println("Value of y is 0 >> " + Test.y);
	 }
	 
}

class Test {
	public static int y = 0;
}
