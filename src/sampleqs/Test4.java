package sampleqs;

import java.util.Stack;

public class Test4 {

	class Inner {
		void test() {
			if(Test4.this.flag)
				sample();
		}
	}
	
	public boolean flag = true;
	
	public void sample() {
		System.out.println("Sample");
	}
	public Test4() {
		(new Inner()).test();
	}
	public static void main(String[] args) {
		
		new Test4();
		
		
	}

}
