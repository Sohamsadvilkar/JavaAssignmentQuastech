package pack1;

public class AsciiValues {

	public static void main(String[] args) {
        
        printASCIIValues();
    }

    public static void printASCIIValues() {
       
        for (int i = 0; i <= 127; i++) {
            
            System.out.println("ASCII value of " + (char) i + " is: " + i);
        }
    }
}
