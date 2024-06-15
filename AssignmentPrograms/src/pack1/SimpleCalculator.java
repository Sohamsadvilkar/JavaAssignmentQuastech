package pack1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
               int operator, n1,n2;
               System.out.println(" 1-Add\n 2-Subtract\n 3-Multiply\n 4-Divide");
               System.out.print("Choose Operator:");
               
               Scanner sc= new Scanner(System.in);
               
               operator= sc.nextInt();
               
               System.out.print("Enter First Number");
               n1=sc.nextInt();
               
               System.out.print("Enter Second Number");
               n2=sc.nextInt();
               
               double result=0;
               
               switch (operator) {
               case 1:
            	   result=n1+n2;
            	   break;
            	   
               case 2:
            	   result=n1-n2;
            	   break;
               case 3:
            	   result= n1*n2;
            	   break;
               case 4:
            	   result= n1/n2;
            	   break;
            	   
               default:
            	   System.out.println("Entered Operator is Invalid");
            	   
               }
               
               System.out.println("Result is: "+result );
               
            
	}

}
