package sampleqs;

public class WrappersTest {

	public static void main(String[] args) {
		Integer x = new Integer(1);
		modifyWrappers(x);
		System.out.println("x= " + x.intValue());

		Dog dog = new Dog();
		dog.name = "Max";
		foo(dog);
		System.out.println(dog.name.equals("Fifi"));
	}
	
	static void modifyWrappers(Integer x) {
		x = new Integer(5);
	}

	public static void foo(Dog dog) {
		dog.name = "Fifi";
	}
	public static class Dog {
		public String name;
	}
}
