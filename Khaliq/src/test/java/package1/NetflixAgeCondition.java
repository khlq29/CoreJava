package package1;

import java.util.Scanner;

public class NetflixAgeCondition {
	public static void main(String[] args) {
		// if iam using netflix if my age is greater 18 show webseries or else block the user
		
		
	}public static  int age() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" enter age here to access netflix: ");
		int age  = scanner.nextInt();
	
		if(age>=18) {
			System.out.println("Provide the adult webseries list....");
		}
		else {
			System.out.println("Provide kids show or block the access...");
		}
		
		scanner.close();
		return age;
	}
}
