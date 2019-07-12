package sampleqs;

public class TestDog {
	
	public static class Dog {
		public String name;
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Max";
		foo(dog);
		System.out.println(dog.name.equals("Fifi"));
		
//		final Integer x;
//		System.out.println(x);

		int x = 2;
		x=x<<2;
		System.out.println("x: " + x);
	}
	private static void foo(Dog dog) {
		dog.name = "Fifi";
		
	}
}
