package javaBeginnerCourse;

import java.util.Scanner;

public class Loops2 {
	
	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
	}

}
