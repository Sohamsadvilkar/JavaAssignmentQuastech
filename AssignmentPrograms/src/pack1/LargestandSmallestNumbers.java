package pack1;

import java.util.Scanner;

public class LargestandSmallestNumbers {

	 public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        
	        int largest = Integer.MIN_VALUE; 
	        int smallest = Integer.MAX_VALUE; 

	        
	        char choice;

	        do {
	            
	            System.out.print("Enter a number: ");
	            int number = scanner.nextInt();

	            
	            if (number > largest) {
	                largest = number;
	            }
	            if (number < smallest) {
	                smallest = number;
	            }

	            
	            System.out.print("Do you want to enter another number? (Y/N): ");
	            choice = scanner.next().charAt(0);

	        } while (choice == 'Y' || choice == 'y');

	        
	        System.out.println("Largest number entered: " + largest);
	        System.out.println("Smallest number entered: " + smallest);

	        
	        scanner.close();
	    }

}
