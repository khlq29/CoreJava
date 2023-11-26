package javaBeginnerCourse;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int n = scanner.nextInt();
		int x=0;
		if (n % 3 == 0) {
			if (n % 5 == 0)
				x = 3;
			else
				x = 1;
		}
		else if (n % 5 == 0) {
			if (n % 3 == 0)
				x = 3;
			else
				x = 2;
		}
		// here I used switch statements for practice purpose
		switch(x) {
		case 1 :
			System.out.println("Buzz");
			break;
		case 2 :
			System.out.println("Fizz");
			break;
		case 3 :
			System.out.println("FizzBuzz");
			break;
		default:
			System.out.println(n);
		}
		// alternate solution by Mosh
		if (n % 5 == 0 && n % 3 == 0)
			System.out.println("FizzBuzz");
		else if (n % 5 == 0)
			System.out.println("Fizz");
		else if (n % 3 == 0)
			System.out.println("Buzz");
		else
			System.out.println(n);
		
		scanner.close();
	}

}
