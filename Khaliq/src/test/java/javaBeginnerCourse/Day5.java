package javaBeginnerCourse;

public class Day5 {
	public static void main(String[] args) {
		//Implicit casting
		//happens automatically when we store a value 
		//in a larger or more
		//precise data type. 
		//byte > short > int > long > float > double
		//short x=1;
		//int y=x+2;
		//double z = 1.1; 
		//double a = z + 2;
		//here 2 is an integer so java automatically converts
		//it into double 2.00
		//double b = 1;
		//int c = (int)b + 2;
		//explicit casting
		//we do it manually
		//String x = "1";
		//Integer.parseInt(x) 
		//wrapper class for int primitive type
		//used to convert string to int
		//int y = Integer.parseInt(x) + 2;
		String x = "1.1";
		double y = Double.parseDouble(x) + 2;
		
		System.out.println(y);
		
	}

}
