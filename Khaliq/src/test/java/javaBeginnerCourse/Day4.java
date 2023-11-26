package javaBeginnerCourse;

public class Day4 {
	public static void main(String[] args) {
		//c:\Windows\...
		String message = "Hello \"Khaliq\"";
		//here we used the backslash to escape the
		//double quotes in order to print the double
		//quotes
		String message1 = "c:\\Windows\\..";
		//since backslash is used to escape the double
		//quotes, so if we have to print a backslash
		//we use another backslash.
		String message2 = "c:\nWindows\\..";
		//here backslash n "\n" is used to change the line
		String message3 = "c:\tWindows\\..";
		//to include tap in the line
		System.out.println(message);
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
	}

}
