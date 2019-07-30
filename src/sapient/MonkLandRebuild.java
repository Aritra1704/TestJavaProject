package sapient;

import java.util.Scanner;

public class MonkLandRebuild {

	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        long out = solve(arr, N);
        System.out.println(out);
    }
	
	public static long solve(long[] arr, long N){
        long totalCount = 0;
        int j = arr.length - 1;
        int i = 1;
        while(j >= 0) {
        	long jVal = arr[j];
        	if(i < j && jVal > arr[j - i]  && jVal == Math.pow(arr[j - i], 2))
        		totalCount++;
        	if((j - i ) > 0)
        		i++;
        	else {
        		j--;
        		i = 1;
        	}
        }
        return totalCount;
    }
	
	/*
	 * 7
1 2 2 4 4 7 4
	 * */
//    public static long solve(long[] arr, long N){
//        long totalCount = 0;
//        for(int j = arr.length - 1; j >= 0; j--) {
//        	long jVal = arr[j];
//        	for(int i = j-1; i >= 0; i--) {
//        		if(jVal == Math.pow(arr[i], 2))
//        			totalCount++;
//        	}
//        }
//        return totalCount;
//    }

}
