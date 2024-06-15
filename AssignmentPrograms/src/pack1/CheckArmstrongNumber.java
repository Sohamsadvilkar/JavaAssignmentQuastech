package pack1;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        
        scanner.close();
    }

    
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        
        return sum == originalNumber;
    }

}
