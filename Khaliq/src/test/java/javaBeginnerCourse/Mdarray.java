package javaBeginnerCourse;

import java.util.Arrays;

public class Mdarray {
	public static void main(String[] args) {
		//int[][] numbers = new int[2][3];
		//int[][][] numbers = new int[2][3][5];
		int[][] numbers = { {1,2,3},{4,5,6}};
	    //numbers[0][0][0] = 1;
		System.out.println(Arrays.deepToString(numbers));
		//use deeptostring to print multidimentional arrays
		
	}
	public static void main1(String[] args) {
		final float PI = 3.14F;
		//usinf 'final' to give a constant value to a
		//variable whose value should not be changed 
		//throughout the program
		//use upper case to name constant
		System.out.println(PI);
	}

}
