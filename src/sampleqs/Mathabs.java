package sampleqs;

import java.util.ArrayList;

public class Mathabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abs(-5));
		
		checkifArmstrong(153);
		
//		Parent obj = new Child();
//		obj.display();
		
	}
	 public static int abs(int a) {
	        return (a <= 0) ? 0 - a : a;
    }
	 
	 public class Parent {
		 public void display() {
			 System.out.println("This is parent");
		 }
	 }
	 
	 public class Child extends Parent {
		 public void display() {
			 System.out.println("This is child");
		 }
	 }
	 
	 private static void checkifArmstrong(int a) {
	       ArrayList<Integer> nums = new ArrayList();
	       int input = a;
	        while(input > 0) {
	            nums.add(input%10);
	            input=input/10;
	        }
	        int sum = 0;
	        for(int i = 0; i < nums.size(); i++) {
	            sum+= Math.pow(nums.get(i), 3);
	        }
	        
	        boolean result = false;
	        if(sum == a)
	             result = true;
	        // Output the variable to STDOUT
	        System.out.println(result);
	   }
}
