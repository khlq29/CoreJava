package javaBeginnerCourse;

class Student {
	String name;
	static String school;
	
	
	public static void changeSchool() {
		school = "newschool";
	}
	}
	
public class Oops1 {
	public static void main(String[] args) {
		
		Student.school = "SFS";
		Student s1 = new Student();
		s1.name = "tony";
		System.out.println(s1.school);
	
		
	}

}
