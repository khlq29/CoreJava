package javaBeginnerCourse;

public class Ifstatements {
	public static void main(String[] args) {
		int income = 120_000;
		//String className;
		//if income(income > 100_000)
			//className = "First";
		//else
			//className = "Economy";
		//optimizing the above code using ternary operator
		String className = income > 100_000 ? "First" : "Economy";
		System.out.println(className);
	}

}
