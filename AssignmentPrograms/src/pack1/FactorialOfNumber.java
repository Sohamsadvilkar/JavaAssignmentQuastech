package pack1;

import java.util.Scanner;

public class FactorialOfNumber {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();

	        
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            
	            long factorial = calculateFactorial(number);
	            System.out.println("Factorial of " + number + " is: " + factorial);
	        }

	       
	        scanner.close();
	    }

	    public static long calculateFactorial(int n) {
	       
	        if (n == 0) {
	            return 1;
	        }

	        
	        long factorial = 1;

	       
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }

	        return factorial;
	    }

}
