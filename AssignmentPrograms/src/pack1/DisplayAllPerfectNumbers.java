package pack1;

public class DisplayAllPerfectNumbers {

	public static void main(String[] args) {
        
        for (int i = 1; i <= 10000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        
        
        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sumOfDivisors += divisor;
            }
        }

        
        return sumOfDivisors == number;
    }

}
