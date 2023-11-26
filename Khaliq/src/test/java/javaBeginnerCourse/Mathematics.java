package javaBeginnerCourse;

public class Mathematics {
	public static void main(String[] args) {
		int result1 = Math.round(1.1F);
		int result2 = (int)Math.ceil(1.1F);
		int result3 = (int)Math.floor(1.1F);
		int result4 = Math.max(1, 2);
		int result5 = (int)Math.round(Math.random()*100);
		int result6 = (int)Math.random()*100;
		//in result6 the answer will always be zero since the 
		//int is applied to math.random which returns
		//any random value from 0 to 1 
		int result7 = (int)(Math.random()*100);
		//using parenthesis to separate the operation
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
	}

}
