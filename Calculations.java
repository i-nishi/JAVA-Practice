package introduction;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		
		Addition();
				
	}
	
	public static void Addition() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter how many numbers do you want to add.");
		
		int count = sc.nextInt();
		
		System.out.println("Please enter the number to be added.");
		
		float total = 0f;
		
		for (int i=1; i<=count; i++) {
			float num = sc.nextFloat();
			total += num;
		}
		
		System.out.println("Total = " + total);
	}
	
	public static void Subtraction() {
		
		System.out.println("Please enter the number to be subtracted.");
		Scanner sc = new Scanner(System.in);
		
		float total = sc.nextFloat();
				
		for (int i=0; i<=4; i++) {
			float num = sc.nextFloat();
			total -= num;
		}
		
		System.out.println("Total = " + total);
	}
	
	public static void Multiplication() {
		
		System.out.println("Please enter the number to be multiplied.");
		Scanner sc = new Scanner(System.in);
						
		for (int i=0; i<=4; i++) {
			float num = sc.nextFloat();
			total = ;
		}
		
		System.out.println("Total = " + total);
	}
}
