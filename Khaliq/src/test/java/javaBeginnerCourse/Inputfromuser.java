package javaBeginnerCourse;

import java.util.Scanner;

public class Inputfromuser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//scanner.nextByte();
		//System.out.print("Age: ");
		//byte age = scanner.nextByte();
		//System.out.println("you are" + " " + age);
		System.out.print("Name: ");
		//String name = scanner.next();
		//if we type our full name it will only return the first
		//part ex 'khaliq anwar' it will only store khaliq
		//since sees this as two tokens
		//in order to store full name we use nextline
		//String name = scanner.nextLine();
		//System.out.println("You are" + " " + name.trim() + "\nNumber of characters is " + name.length());
		String name = scanner.nextLine().trim();
		System.out.println(name);
	}

}
