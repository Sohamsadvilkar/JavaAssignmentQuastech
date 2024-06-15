package pack1;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent number: ");
        int exponent = scanner.nextInt();

        
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        
        scanner.close();
    }

    public static double power(double base, int exponent) {
        
        if (exponent == 0) {
            return 1;
        }
        
        else if (exponent > 0) {
            double result = 1;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        }
        else {
            return 1 / power(base, -exponent);
        }
    }

}
