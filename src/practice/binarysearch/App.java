package practice.binarysearch;

public class App {

	public static void main(String[] args) {
		Algorithm algo = new Algorithm();
		int[] testarray = {2, 4, 6, 7, 9, 11, 15, 17, 19, 25, 27, 29, 31};
		int testsearch = 11; 
		int iteration = algo.lsIteration(testarray, testsearch);
		int recursion = algo.bsRecursion(testarray, testsearch, 0, testarray.length - 1);

		System.out.println("iteration: " + iteration + " recursion: " + recursion);
	}

}
