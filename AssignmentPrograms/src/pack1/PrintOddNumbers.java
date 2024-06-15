package pack1;

public class PrintOddNumbers {

	public static void main(String[] args) {
        
        printOddNumbers();
    }

    public static void printOddNumbers() {
       
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 != 0) {
                System.out.print(i + " \n ");
            }
        }
        System.out.println(); 
    }

}
