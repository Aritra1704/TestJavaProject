package sapient;

import java.util.Arrays;
import java.util.Scanner;

public class MonotronMines {
	
	public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        long L = 0, R = 0;
        int STEP_SIZE = 0;
        
        L = sc.nextLong();
        R = sc.nextLong();
        STEP_SIZE = sc.nextInt();
        
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        solve(L, R, STEP_SIZE, arr, N);
    }
    
    public static void solve(long L, long R, int STEP_SIZE, long[] arr, long N){
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        long max = arr[arr.length - 1];
        
        int leftCount = getSteps(L, STEP_SIZE, arr, max);
        
        int rightCount = getSteps(R, STEP_SIZE, arr, max);
        
        System.out.println(leftCount + " " + rightCount);
    }
    
    public static int getSteps(long startStep, int STEP_SIZE, long[] arr, long max) {
        long step = startStep;
        int stepCount = 0;
        int count = 0;
        while(step <= max && count < arr.length) {
            if(step == arr[count]) {
                stepCount++;
                count++;
            } else if(step > arr[count])
                count++;
            else
                step += STEP_SIZE;
        }
        return stepCount;
    }
    
    public static void quicksort(long[] input, int start, int end) {
        if(start < end) {
            int pivot = partition(input, start, end);
            quicksort(input, start, pivot - 1);
            quicksort(input, pivot + 1, end);
        }
    }
    
    public static int partition(long[] input, int start, int end) {
        int pivot = end;
        
        int i = start - 1;
        for(int j = start; j <= end - 1; j++) {
            if(input[j] < input[pivot]) {
                i++;
                swap(input, i, j);
            }
        }
        i++;
        swap(input, i, pivot);
        return i;
    }
    
    public static void swap(long[] input, int initial, int actual) {
        long temp = input[initial];
        input[initial] = input[actual];
        input[actual] = temp;
    }
}
