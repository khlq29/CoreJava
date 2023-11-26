package javaBeginnerCourse;

public class Day6 {
	public static void main(String[] args) {
		//int x=1;
		//int y=2;
		//System.out.println(x == y); //equality operator return is 
		//boolean value
		//System.out.println(x != y); //inequality operator
		//System.out.println(x <= y);
		//int temperature = 12;
		//boolean isWarm = temperature > 20 && temperature < 30;
		//System.out.println(isWarm);
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);
	
	}

}
