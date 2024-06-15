package pack1;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

       
        int sum = calculateSumOfOddNumbers(n);
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);

        
        scanner.close();
    }

    public static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

}
