package pack1;

import java.util.Scanner;

public class NaturalNumbers {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	       
	        printNaturalNumbers(n);

	       
	        scanner.close();
	    }

	    public static void printNaturalNumbers(int n) {
	       
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	            return;
	        }

	       
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println(); 
	    }

}
