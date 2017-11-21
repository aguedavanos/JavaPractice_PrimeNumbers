/*
Opdracht 2: 10,001st Prime
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?


A natural number (1, 2, 3, 4, 5, 6, etc.) is called a prime number (or a prime) 
if it has exactly two positive divisors, 1 and the number itself.
*/

import java.util.*;

public class Opdr2Prime
{
	public static void main(String[] args) {

		int nthPrime = 10_001; //requested nth prime number
		int currNumber = 2; //prime starts at 2
		ArrayList<Integer> prevPrimeNumbers = new ArrayList<Integer>();
		
		System.out.println("Calculating...");
		//Calculations
		while (prevPrimeNumbers.size() < nthPrime)
		{
			
			boolean isDividable = false;

			for (Integer primeNum : prevPrimeNumbers)
			{
				if (currNumber%primeNum == 0 && primeNum != currNumber)
				{
					isDividable = true;
					break; //already dividable, don't have to test any more numbers
				}
			}

			if(!isDividable)
			{
				if(!prevPrimeNumbers.contains(currNumber))
				{
					prevPrimeNumbers.add(currNumber);
					//System.out.println("isDividable = " + isDividable);
				} 
			}
					
			//System.out.println("I just checked "+ currNumber + ", the last PrimeNumber was " + prevPrimeNumbers.get(prevPrimeNumbers.size()-1));
			currNumber++;		
		}

		System.out.println("List of Primes: " + prevPrimeNumbers);	
		System.out.println("The " + nthPrime + "th Prime number is " + prevPrimeNumbers.get(prevPrimeNumbers.size()-1));
		
	}
}
