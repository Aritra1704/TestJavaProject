package sampleqs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.BitSet;

public class classA {
//	public classA() {
//		System.out.println("A");
//	}
	int i;
	void display() {
		System.out.println(i);
	}
	
	public static void main(String[] args) throws Exception {
		claasB a = new claasB();
		ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("datafile"));
		save.writeObject(a);
		save.flush();
		
		ObjectInputStream restore = new ObjectInputStream(new FileInputStream("datafile"));
		claasB z = (claasB) restore.readObject();  

	}
	
//	class A {
//		public A() {
//			System.out.println("A");
//		}
//	}
}
