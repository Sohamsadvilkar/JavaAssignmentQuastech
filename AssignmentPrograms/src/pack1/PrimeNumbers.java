package pack1;

import java.util.Scanner;

public class PrimeNumbers {

	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number to check if it is prime: ");
	        int number = scanner.nextInt();

	       
	        boolean isPrime = isPrime(number);

	        
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	       
	        scanner.close();
	    }

	    public static boolean isPrime(int number) {
	       
	        if (number <= 1) {
	            return false;
	        }

	        
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; 
	            }
	        }

	        return true; 
	    }

}
