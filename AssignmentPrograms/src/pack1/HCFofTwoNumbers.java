package pack1;

import java.util.Scanner;

public class HCFofTwoNumbers {

	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int number1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int number2 = scanner.nextInt();

	        
	        int hcf = calculateHCF(number1, number2);

	        
	        System.out.println("HCF of " + number1 + " and " + number2 + " is: " + hcf);

	        
	        scanner.close();
	    }

	    public static int calculateHCF(int number1, int number2) {
	        
	        number1 = Math.abs(number1);
	        number2 = Math.abs(number2);

	        
	        while (number2 != 0) {
	            int temp = number2;
	            number2 = number1 % number2;
	            number1 = temp;
	        }

	        return number1; 
	    }

}
