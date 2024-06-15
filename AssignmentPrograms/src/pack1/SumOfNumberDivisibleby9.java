package pack1;

public class SumOfNumberDivisibleby9 {

	public static void main(String[] args) {
        
        int count = 0;
        int sum = 0;

        
        for (int i = 100; i <= 200; i++) {
            
            if (i % 9 == 0) {
                count++; 
                sum += i; 
                System.out.println(i); 
            }
        }

        
        System.out.println("Count of numbers divisible by 9: " + count);
        System.out.println("Sum of numbers divisible by 9: " + sum);
    }

}
