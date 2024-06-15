package pack1;

import java.util.Scanner;

public class ReverseDigits {

	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number to reverse its digits: ");
	        int number = scanner.nextInt();

	        int reversedNumber = reverseDigits(number);
	        System.out.println("Reversed number: " + reversedNumber);

	        scanner.close();
	    }

	    public static int reverseDigits(int number) {
	        int reversedNumber = 0;
	        boolean isNegative = number < 0; 

	        number = Math.abs(number);

	        while (number > 0) {
	            int digit = number % 10; 
	            reversedNumber = reversedNumber * 10 + digit; 
	            number /= 10; 
	        }

	        
	        if (isNegative) {
	            reversedNumber = -reversedNumber;
	        }

	        return reversedNumber;
	    }

}
