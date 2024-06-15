package pack1;

import java.util.Scanner;

public class VowelProgram {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter Any Chracter:");
		Scanner r = new Scanner(System.in);
		
		ch=r.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Chracter is Vowel..");
		}
		else {
			System.out.println("Character is Consonant...");
		}
	}

}
