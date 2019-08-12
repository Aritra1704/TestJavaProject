package sampleqs;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.math.*;

//https://www.spoj.com/problems/PRIME1/
public class PrimeGenerator {

	static BigInteger big0, big1, big2, big3, big5, big7; 
	static HashSet<BigInteger> primes = new HashSet<>();
	public static void main(String[] args) {
		big0 = new BigInteger("0");
		big1 = new BigInteger("1");
		big2 = new BigInteger("2");
		big3 = new BigInteger("3");
		big5 = new BigInteger("5");
		big7 = new BigInteger("7");
		
		System.out.println(isPrime(new BigInteger("" + 104729)));
//		for(int i = 2; i < 20; i++)
//			System.out.println(i + " " + isPrime(new BigInteger("" + i)));

//		addPrimes(10000, 0);
//		addPrimes(20000, 10001);
//		
//		System.out.println("Size: " + primes.size());
//		System.out.println("------------------------------------");
//		Iterator<BigInteger> itr = primes.iterator();
//		while(itr.hasNext()){
//			  System.out.println(itr.next());
//		}
	}
	
	static void addPrimes(int highest, int lowest) {
		for (BigInteger bi = BigInteger.valueOf(highest);
	            bi.compareTo(BigInteger.ZERO) > lowest;
	            bi = bi.subtract(BigInteger.ONE)) {

	        if(isPrime(bi))
	        	primes.add(bi);
	    }
	}

	static boolean isPrime(BigInteger input) {
//		BigInteger divisor = new BigInteger("" +  Math.abs(Math.sqrt(input.longValue())));//input.  sqrt();
		BigInteger divisor = input.divide(big2);
		return checkPrime(input, divisor);
	}
	
	public static boolean checkPrime(BigInteger input, BigInteger divisor) {
		if(input.compareTo(big2) < 0) 
			return false;
		if(input.compareTo(big2) == 0 || input.compareTo(big3) == 0 || input.compareTo(big5) == 0 || input.compareTo(big7) == 0) 
			return true;
		if(input.mod(big2) == big0 || input.mod(big3) == big0 || input.mod(big5) == big0 || input.mod(big7) == big0) 
			return false;
		if(divisor.subtract(big1).compareTo(big1) < 0) 
			return true;
		if(input.mod(divisor).equals(big0)) 
			return false;
		return checkPrime(input, divisor.subtract(big1));
	}
}
