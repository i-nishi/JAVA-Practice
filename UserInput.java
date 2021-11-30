package introduction;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name.");
		String name = sc.next();
		
		System.out.println("Hi " + name + ", How old are you?");
		
		int age = sc.nextInt();
		
		int output = 18 - age;
	
		if (age < 18)
			System.out.println("Sorry " + name + ", you are not allowed. See you after " + output + " years.");
		else
			System.out.println("Welcome " + name + "!");

	}

}
