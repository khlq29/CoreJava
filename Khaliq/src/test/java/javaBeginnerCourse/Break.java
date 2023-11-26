package javaBeginnerCourse;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			//repeats the loop from start, ignores
			//the below statements
			if (input.equals("quit"))
				break; 
			//exits the loop
			
			System.out.println(input);
			
		}
		
		scanner.close();
		
	}
}
