package pack1;

import java.util.Scanner;

public class LCMNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        int lcm = findLCM(num1, num2);

        
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        
        scanner.close();
    }

    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int findLCM(int a, int b) {
        
        return (a * b) / findGCD(a, b);
    }

}
