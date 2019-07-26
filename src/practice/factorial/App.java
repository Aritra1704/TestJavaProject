package practice.factorial;

public class App {

	public static void main(String[] args) {
		Algorithm algo = new Algorithm();
		int testValue = 5;
		int iteration = algo.getFactIteration(testValue);
		int recursion = algo.getFactRecursion(testValue);
		int accumulator = algo.getFactAccumulator(1, testValue);

		System.out.println("iteration: " + iteration + " recursion: " + recursion + " accumulator: " + accumulator);
	}

}
