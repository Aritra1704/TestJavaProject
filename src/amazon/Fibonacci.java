package amazon;

public class Fibonacci {

	public static void main(String[] args) {
		iterativeProcess(5);
		System.out.println("----------------------Recursive----------");
		System.out.println(recursiveProcess(1+1));
	}

	static void iterativeProcess(int val) {
		int a = 2, b = 3, c;
		if(val == 1)
			System.out.println(a);
		else if(val == 2)
			System.out.println(b);
		else {
			System.out.println(a);
			System.out.println(b);
			for(int i = 3; i <= val; i++) {
				c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
	}
	
	static int recursiveProcess(int val) {
		if(val <= 1)
			return 1;
		return recursiveProcess(val - 1) + recursiveProcess(val - 2);
	}
}
