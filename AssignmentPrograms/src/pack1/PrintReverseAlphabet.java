package pack1;

public class PrintReverseAlphabet {

	 public static void main(String[] args) {
	        
	        printReverseAlphabets();
	    }

	    public static void printReverseAlphabets() {
	        
	        for (char c = 'Z'; c >= 'A'; c--) {
	            System.out.print(c + " ");
	        }
	        System.out.println(); 
	    }
}
