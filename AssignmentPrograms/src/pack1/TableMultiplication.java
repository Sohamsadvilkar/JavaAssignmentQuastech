package pack1;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number for multiplication table: ");
        int n = scanner.nextInt();

        
        printMultiplicationTable(n);

        
        scanner.close();
    }

    public static void printMultiplicationTable(int n) {
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

}
