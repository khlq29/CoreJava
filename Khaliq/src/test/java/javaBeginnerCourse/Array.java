package javaBeginnerCourse;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//old method to declare arrays
		//int number1 = 1;
		//int[] numbers = new int[5];
		//to declare an array use square brackets
		//after int, since arrays is a reference type
		//use 'new' to declare it followed by the number
		//of items in the array 'int[5]' for 5 items
		//numbers[0] = 1;
		// using index to access individual 
		//items in the arrays
		//numbers[1] = 2;
		//numbers[10] = 3;
		//here using 10 will throw us an error
		//since this array is of 5 items
		int[] numbers = {2,3,5,1,4};
		//if we know the values before hand use
		//this method to declare an array
		System.out.println(numbers.length);
		Arrays.sort(numbers);
		//to sort the array using Arrays Class and dot operator to call
		//sort
		System.out.println(java.util.Arrays.toString(numbers));
		//using Array class we print the whole array
		//using dot operator to call tostring to print
		//whole array
		
	
	}

	
}
