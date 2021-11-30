package introduction;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number.");
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();		
		
		for (int i = count; i<=1; i--) {
			for (int j = 0; j<=i; j--) {
				System.out.print("* ");
				}
			System.out.println();
		}
	}
}
