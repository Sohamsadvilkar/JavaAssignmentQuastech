package pack1;

import java.util.Scanner;

public class CheckNoPerfectorNot {

	 public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a number to check if it is a perfect number: ");
	        int number = scanner.nextInt();

	       
	        if (isPerfectNumber(number)) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }

	       
	        scanner.close();
	    }


	    public static boolean isPerfectNumber(int number) {
	        int sumOfDivisors = 0;

	        
	        for (int divisor = 1; divisor <= number / 2; divisor++) {
	            if (number % divisor == 0) {
	                sumOfDivisors += divisor;
	            }
	        }

	       
	        return sumOfDivisors == number;
	    }

}
