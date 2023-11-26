package javaBeginnerCourse;

import java.text.NumberFormat;

public class Formattingnumbers {
	public static void main(String[] args) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result1 = currency.format(1234567.891);
		//System.out.println(result);
		NumberFormat percentage = NumberFormat.getPercentInstance();
		String result2 = percentage.format(0.365);
		//NumberFormat.getPercentInstance().format(0.1);
		//this is called method chaining
		String result3 = NumberFormat.getPercentInstance().format(0.1);;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
