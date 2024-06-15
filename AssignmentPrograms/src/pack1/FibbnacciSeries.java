package pack1;

import java.util.Scanner;

public class FibbnacciSeries {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number of terms in Fibonacci series: ");
	        int n = scanner.nextInt();

	        
	        int firstTerm = 0, secondTerm = 1;

	        
	        System.out.print("Fibonacci Series up to " + n + " terms: ");
	        System.out.print(firstTerm + " " + secondTerm + " ");

	        
	        for (int i = 3; i <= n; i++) {
	            int nextTerm = firstTerm + secondTerm;
	            System.out.print(nextTerm + " ");
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }

	        
	        scanner.close();
	    }

}
