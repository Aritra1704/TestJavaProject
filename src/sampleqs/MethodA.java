package sampleqs;

import java.util.HashSet;
import java.util.Set;

public class MethodA {

//	static int a = 4;
//	public Tester() {
//		sample();
//	}
//	
//	public static void sample() {
//		System.out.println(this.a);
//	}
	public static void main(String[] args) {
//		A.method(5);

//		MethodA obj1 = new MethodA();
//		obj1.put(new String("X", new Integer(3)));
//		obj1.put("Y", new Integer(2));
//		obj1.put("Z", new Integer(8));
//		
//		obj1.remove()
		
//		recursion obj = new recursion();
//		System.out.println(obj.func(5));
		
//		double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
//		double result;
//		result= 0;
//		for(int i = 0; i < 6; ++i)
//			result = result + num[i];
//		System.out.print(result/6);
		
//		String s1 = "Hello world";
//		String s2 = s1.substring(0, 4);
//		System.out.println(s2);
		
//		Set<Integer> list = new HashSet<>();
//		list.add(1);
//		list.add(2);
//		list.add(2);
//		list.add(4);
//		list.add(null);
//		
//		if(list.isEmpty())
//			System.out.println("list is empty");
//		else
//			System.out.println(list);
		
//		System.out.println("First in main(");
		
//		boolean var1 = true;
//		boolean var2 = false;
//		System.out.println(var1 & var2);
		
		
		test(99.9);
	}
	
	static void test(float x) {
		System.out.println("float"+x);
	}
	
	static void test(double x) {
		System.out.println(x);
	}

	public static void main(char args[]) {
		System.out.println("Z");
	}
}

class recursion {
	int func(int n) {
		int result;
		if(n == 1)
			return 1;
		result = func(n - 1);
		return result;
	}
}
class A {
	public static void method(int i) {
		System.out.print("Method 1");
	}
	
	public static int method(String s) {
		System.out.print("Method 2");
		return 0;
	}
}
