package pack1;

import java.util.Scanner;

public class FirstNoisMulitipleofSecondNo {

	  public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the First Number: ");
	        int firstNumber = scanner.nextInt();

	       
	        System.out.print("Enter the Second Number: ");
	        int secondNumber = scanner.nextInt();

	       
	        if (isMultiple(firstNumber, secondNumber)) {
	            System.out.println(firstNumber + " is a multiple of " + secondNumber);
	        } else {
	            System.out.println(firstNumber + " is not a multiple of " + secondNumber);
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    public static boolean isMultiple(int first, int second) {
	       
	        return first % second == 0;
	    }

}
