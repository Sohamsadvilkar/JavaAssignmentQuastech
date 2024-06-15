package pack1;

public class PrintEvenNumbers {

	public static void main(String[] args) {
        
        printEvenNumbers();
    }

    public static void printEvenNumbers() {
        
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.print(i +  " \n ");
            }
        }
        System.out.println(); 
    }

}
