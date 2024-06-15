package pack1;

public class PrintArmstrongNumbers {

	public static void main(String[] args) {
        
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        
        return sum == originalNumber;
    }

}
