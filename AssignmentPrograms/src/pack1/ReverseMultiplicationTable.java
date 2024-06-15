package pack1;

import java.util.Scanner;

public class ReverseMultiplicationTable {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number for reverse multiplication table: ");
	        int n = scanner.nextInt();

	       
	        printReverseMultiplicationTable(n);

	        
	        scanner.close();
	    }

	    public static void printReverseMultiplicationTable(int n) {
	        System.out.println("Reverse multiplication table for " + n + ":");
	        for (int i = 10; i >= 1; i--) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }
	    }

}
