package pack1;

public class PrintStrongNumbers {

	 public static void main(String[] args) {
	        
	        for (int i = 1; i <= 100000; i++) {
	            if (isStrongNumber(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    
	    public static boolean isStrongNumber(int number) {
	        int originalNumber = number;
	        int sumOfFactorials = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sumOfFactorials += factorial(digit);
	            number /= 10;
	        }

	        return sumOfFactorials == originalNumber;
	    }

	   
	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        int result = 1;
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

}
