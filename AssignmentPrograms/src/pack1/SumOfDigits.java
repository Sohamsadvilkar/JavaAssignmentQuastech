package pack1;

import java.util.Scanner;

public class SumOfDigits {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to find the sum of its digits: ");
	        int number = scanner.nextInt();

	        int sum = sumOfDigits(number);
	        System.out.println("Sum of digits: " + sum);

	        scanner.close();
	    }

	    public static int sumOfDigits(int number) {
	        int sum = 0;
	        boolean isNegative = number < 0; 
	        number = Math.abs(number);

	        while (number > 0) {
	            int digit = number % 10; 
	            sum += digit; 
	            number /= 10; 
	        }

	        
	        if (isNegative) {
	            sum = -sum;
	        }

	        return sum;
	    }

}
