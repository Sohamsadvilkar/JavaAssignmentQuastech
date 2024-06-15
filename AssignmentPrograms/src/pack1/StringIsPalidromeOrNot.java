package pack1;

import java.util.Scanner;

public class StringIsPalidromeOrNot {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();

       
        if (isPalindrome(inputString)) {
            System.out.println("'" + inputString + "' is a palindrome.");
        } else {
            System.out.println("'" + inputString + "' is not a palindrome.");
        }

       
        scanner.close();
    }

    
    public static boolean isPalindrome(String str) {
        
        str = str.trim().toLowerCase();

        
        StringBuilder reversed = new StringBuilder(str).reverse();

        
        return str.equals(reversed.toString());
    }

}
