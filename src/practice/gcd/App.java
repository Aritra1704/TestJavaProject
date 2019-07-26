package practice.gcd;

public class App {

	public static void main(String[] args) {
		Algorithm algo = new Algorithm();
		int testNum1 = 64;
		int testNum2 = 128;
		int iteration = algo.gcdIteration(testNum1, testNum2);
		int recursion = algo.gcdRecursion(testNum1, testNum2);

		System.out.println("iteration: " + iteration + " recursion: " + recursion);
	}

}
