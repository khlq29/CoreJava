package javaBeginnerCourse;

import java.util.HashSet;
import java.util.Set;


public class LearnHash {
	public static void main(String[] args) {
		
		Set<StudentSet> s = new HashSet<>();
		
		s.add(new StudentSet("khaliq",29));
		s.add(new StudentSet("shaby",2));
		s.add(new StudentSet("asim",9));
		s.add(new StudentSet("zarr",45));
		s.add(new StudentSet("khaliq",29));
		
		StudentSet s1 = new StudentSet("khaliq", 45);
		StudentSet s2 = new StudentSet("khaliq", 4);
		System.out.println(s1.equals(s2));
		
		System.out.println(s);
		
	}
	
	

}
