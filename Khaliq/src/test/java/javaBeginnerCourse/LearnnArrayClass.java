package javaBeginnerCourse;

import java.util.Arrays;

public class LearnnArrayClass {
	public static void main(String[] args) {
		
		
		/*
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(numbers, 5);
		System.out.println(index);
		*/
		
		Integer[] numbers = {16,28,30,42,45,6,72,18,29,10};
		Arrays.sort(numbers);
		//sorts the array
		System.out.print("Sorted Array is [");
		for(int j : numbers){
			System.out.print(j + " ");
		}
		System.out.println("]");
		
		Arrays.fill(numbers, 12);
		//fills the array with single value
		
		System.out.println("Filled Array - ");
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		
		
	}

}
