package pack1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

       
        int sum = calculateSum(n);
        System.out.println("The sum of all natural numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
