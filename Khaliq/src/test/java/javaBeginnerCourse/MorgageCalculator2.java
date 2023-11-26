package javaBeginnerCourse;

import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculator2 {
	public static void main(String[] args) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
	
		int principal;
		float r;
		byte years;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Principal ($1K - $1M): ");
		    principal = scanner.nextInt();
		    if (1000 <= principal && principal <= 1000000)
		    	break;
		    else
		    	System.out.println("Enter a number between 1,000 and 1,000,000.");
		    	continue;
		}
		while (true) {
		    System.out.print("Annual Interest Rate: ");
		    r = scanner.nextFloat();
		    if (0 < r && r <= 30)
		    	break;
		    else
		    	System.out.println("Enter a number greater than 0 and less than or equal to 30.");
		    	continue;
		}
		float monthlyInterest = r / PERCENT / MONTHS_IN_YEAR;
		
		while (true) {
			System.out.print("Period (Years): ");
			years = scanner.nextByte();
			if (0 < years && years <= 30)
		    	break;
		    else
		    	System.out.println("Enter a value between 1 and 30.");
		    	continue;
		}
		int numberOfPayments = years * MONTHS_IN_YEAR;
		
		double mortgage = principal
				* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments)-1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		
		scanner.close();
	}

	}


