package pack1;

import java.util.Scanner;

public class SumOfEvenNumbers {

	  public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        
	        int sum = calculateSumOfEvenNumbers(n);
	        System.out.println("The sum of all even numbers from 1 to " + n + " is: " + sum);

	        
	        scanner.close();
	    }

	    public static int calculateSumOfEvenNumbers(int n) {
	        int sum = 0;
	        
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }
	        return sum;
	    }

}
